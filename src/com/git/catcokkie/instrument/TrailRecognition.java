package com.git.catcokkie.instrument;

import com.git.catcokkie.fileoperator.FileOperator;

import java.io.IOException;

import static com.git.catcokkie.test.TestHandleTrail.newLines;

/**
 * Description:
 *
 * @author Administrator
 * @version 1.0
 * @date 2017-12-13
 * @see 1
 * @since 1
 */
public class TrailRecognition {
    /**
     * 对轨迹进行处理
     * 先分割轨迹数据
     * 根据速度>150km/h的做置空处理后剔除
     */
    public static String[] trailRecognitionRemoveWrong() {
        for (int i = 0; i < newLines.length; i++) {
            //testArray 分割某一行
            String[] testArray0 = newLines[i].split(",");
            if (Double.valueOf(testArray0[3]) > 150) {
                newLines[i] = "";
            }
        }
        //清除数组newlines中的空值
        //用StringBuffer来存放数组中的非空元素，用“;”分隔
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newLines.length; i++) {
            if ("".equals(newLines[i])) {
                continue;
            }
            sb.append(newLines[i]);
            if (i != newLines.length - 1) {
                sb.append(";");
            }
        }
        //用String的split方法分割，得到数组并打印输出新文件d中
        newLines = sb.toString().split(";");
        for (int i = 0; i < newLines.length; i++) {
            String output = newLines[i] + "\n";
            try {
                FileOperator.fileOperatorD(output);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        newLines = new FileReader
                ("E:\\ simulate\\a\\withoutWrong.txt", "UTF-8").getLines();

        return newLines;
    }

    /**
     * 对轨迹进行识别处理
     * 先分割轨迹数据
     * 根据后一个时间点减前一个时间点不为1
     * 判断缺失轨迹并输出到新文件中
     */
    public static void trailRecognitionSelectDeficiencyTrail() {
        for (int i = 0; i < newLines.length - 1; i++) {
            //testArray 分割某一行
            String[] testArray0 = newLines[i].split(",");
            String[] testArray1 = newLines[i + 1].split(",");
            if ((Long.valueOf(testArray1[2]) - Long.valueOf(testArray0[2])) != 1) {
                String deficiencyOutput = newLines[i] + "\n" + newLines[i + 1] + "\n";
                try {
                    FileOperator.fileOperatorE(deficiencyOutput);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
    }

    /**
     * 对轨迹进行识别处理
     * 先分割轨迹数据
     * 根据速度判断行程方式 并分别输入至各个文件中
     * walk ride drive
     */
    public static void trailRecognition() {
        for (int i = 0; i < newLines.length; i++) {
            //testArray 分割某一行
            String[] testArray1 = newLines[i].split(",");
            if ((150 >= Double.valueOf(testArray1[3])) && (30 < Double.valueOf(testArray1[3]))) {
                String deficiencyOutput = newLines[i] + "\n" ;
                try {
                    FileOperator.fileOperatorDrive(deficiencyOutput);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if ((30 >= Double.valueOf(testArray1[3])) && (10 < Double.valueOf(testArray1[3]))) {
                String deficiencyOutput = newLines[i] + "\n" ;
                try {
                    FileOperator.fileOperatorRide(deficiencyOutput);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if ((10 >= Double.valueOf(testArray1[3])) && (0 < Double.valueOf(testArray1[3]))) {
                String deficiencyOutput = newLines[i] + "\n" ;
                try {
                    FileOperator.fileOperatorWalk(deficiencyOutput);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 对轨迹进行识别处理
     * 先分割轨迹数据
     * 根据速度判断行程方式 并分别输入至各个文件中
     * walk ride drive
     */
    public static void trailRecognitionRemoveStay() {
        for (int i = 0; i < newLines.length - 10; i++) {
            //testArray 分割某一行
            String[] testArray0 = newLines[i].split(",");
            double lat1 = Double.parseDouble(testArray0[0]);
            double lng1 = Double.parseDouble(testArray0[1]);
            //停留范围循环取值校验
            int loopTime = 10;
            //停留范围大小
            double r = 10;
            //临时判定变量
            boolean tempBoolean = true;
            for (int j = 1; j < loopTime; j++) {
                String[] testArrayj = newLines[i + j].split(",");
                double lat2 = Double.parseDouble(testArrayj[0]);
                double lng2 = Double.parseDouble(testArrayj[1]);
                double length = LocationUtils.getDistance(lat1, lng1, lat2, lng2);
                if (length <= r) {
                    tempBoolean = false;
                } else {
                    tempBoolean = true;
                    break;
                }
            }
            //输出停留轨迹
            if (!tempBoolean) {
                for (int j = 0; j < loopTime; j++) {
                    String stayOutput = newLines[i + j] + "\n";
                    try {
                        FileOperator.fileOperatorF(stayOutput);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            i += 9;
        }
    }

}

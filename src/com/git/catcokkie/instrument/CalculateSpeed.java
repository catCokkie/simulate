package com.git.catcokkie.instrument;

import com.git.catcokkie.fileoperator.FileOperator;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-14
 */
public class CalculateSpeed {
    /**
     * 计算单点速度
     *
     * @param lines
     */
    public static void calculateSpeed( String[] lines ) {
        for (int i = 0; i < lines.length - 1; i++) {
            //testArray 分割某一行
            String[] testArray0 = lines[i].split(",");
            String[] testArray1 = lines[i + 1].split(",");
            //取出前后点经纬坐标
            double lat1 = Double.parseDouble(testArray0[0]);
            double lng1 = Double.parseDouble(testArray0[1]);
            double lat2 = Double.parseDouble(testArray1[0]);
            double lng2 = Double.parseDouble(testArray1[1]);
            //计算速度
            double speed = LocationUtils.getDistance(lat1, lng1, lat2, lng2);
            DecimalFormat df = new DecimalFormat("0.0");
            String speed1 = df.format(speed);
            StringBuffer sb = new StringBuffer();
            sb.append(lines[i]).append(",").append(speed1).append("\n");
            lines[i] = sb.toString();
            String output = lines[i];
            try {
                FileOperator.FileOperator1(output);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

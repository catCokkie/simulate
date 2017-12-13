package com.git.catcokkie.instrument;


import com.git.catcokkie.TraiFactor.*;
import com.git.catcokkie.fileoperator.FileOperator;

import java.io.IOException;

import static com.git.catcokkie.instrument.RandomNumber.PercentageRandom;
import static com.git.catcokkie.test.TestMakeFile.coordinate;
import static com.git.catcokkie.test.TestMakeFile.fakeNowStringTime;


public class ContentFactory {
    /*
     生成随机数
     根据随机数返回判断六种状态 switch
     错误 缺失 停留 三种行进状态
     1根据状态生成坐标（gps）
     2调用时间生成方法记录时间
     合成字符串 作为方法返回
     */
    public static void contentFactory() {
        int s1 = PercentageRandom();
        double[] tempCoordinate = new double[2];
        String tempContentFactory = null;

        switch (s1) {
            case 0:
                tempCoordinate = WrongWay.WrongWay(tempCoordinate);
                String stime = String.valueOf(fakeNowStringTime);
                tempContentFactory = "" + tempCoordinate[0] + "," + tempCoordinate[1] + ","+stime+"\n";
                try {
                    FileOperator.FileOperator(tempContentFactory);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                fakeNowStringTime++;
                break;
            case 1:
                for (int i=0;i<100;i++){
                    if (Math.random()<=0.5){
                        String stime1 = String.valueOf(fakeNowStringTime);
                        String output="0,0,"+stime1+"\n";
                        fakeNowStringTime++;
                        try {
                            FileOperator.FileOperator(output);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else{
                        coordinate = Walk.walk(coordinate);
                        String output=coordinateMaker(coordinate);
                        try {
                            FileOperator.FileOperator(output);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            case 2:
                for (long i = 0; i <98; i++) {
                    coordinate = Stay.Stay(coordinate);
                    String output=coordinateMaker(coordinate);
                    try {
                        FileOperator.FileOperator(output);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                for (long i = 0; i <100; i++) {
                    coordinate = Walk.walk(coordinate);
                    String output=coordinateMaker(coordinate);
                    try {
                        FileOperator.FileOperator(output);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 4:
                for (long i = 0; i <99; i++) {
                    coordinate = Ride.Ride(coordinate);
                    String output=coordinateMaker(coordinate);
                    try {
                        FileOperator.FileOperator(output);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 5:
                for (long i = 0; i <100; i++) {
                    coordinate = Drive.Drive(coordinate);
                    String output=coordinateMaker(coordinate);
                    try {
                        FileOperator.FileOperator(output);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            default:
        }
    }
    public static String coordinateMaker(double[] array ){
        String tempContentFactory = "" + array[0] + "," + array[1] + ",";
        String stime = String.valueOf(fakeNowStringTime);
        String s = tempContentFactory + stime + "\n";
        fakeNowStringTime++;
        return s;
    }



}

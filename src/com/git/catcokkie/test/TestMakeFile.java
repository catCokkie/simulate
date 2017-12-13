package com.git.catcokkie.test;



import com.git.catcokkie.instrument.ContentFactory;

import java.io.*;
import java.util.Scanner;

import static com.git.catcokkie.test.NowString.nowStringTime;

public class TestMakeFile {
    public static double[] coordinate = {0, 0};
    public static long fakeNowStringTime = nowStringTime;

    public static void main( String[] args ) {
        /**
         *输入生成文件时间长度
         * 输入输出类
         * 根据时间转换循环次数
         * 待补充输入异常抛出
         **/
        System.out.println("输入生成轨迹时间的长度");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long nTimeTransIntoTimes = n * 36;


        /**
         *调用轨迹生成方法contentFactory
         * 输入输出类
         **/
        for (long i = 0; i <= nTimeTransIntoTimes; i++) {
            ContentFactory.contentFactory();
        }

    }
}

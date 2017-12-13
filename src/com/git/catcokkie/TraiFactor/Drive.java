package com.git.catcokkie.TraiFactor;

import java.util.Random;

public class Drive {
//        public static double[] drive=new  double[2];

        public static double[] Drive( double array[] ) {
                //设置随机范围 速度
                double max = 0.000375375376;
                double min = 0.000075075075;
                Random random = new Random();
                double s = random.nextDouble()*(max-min)+ min;
                 //操作数组
                double r1 = array[0] + s;
                double r2 = array[1] ;
                double[] result = new double[2];
                //返回结果
                result[0] = r1;
                result[1] = r2;
                return result;
        }
}

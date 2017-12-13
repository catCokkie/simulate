package com.git.catcokkie.TraiFactor;

import java.util.Random;

import static com.git.catcokkie.test.Test.coordinate;

public class Walk {
    public static double[] walk( double[] array ) {
        //设置随机范围 速度
        double max = 0.000025025;
        double min = 0;
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

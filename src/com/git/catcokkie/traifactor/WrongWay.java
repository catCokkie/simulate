package com.git.catcokkie.traifactor;

public class WrongWay {

    public static double[] wrongWay( double array[]){
        double r1 =array[0]+Math.random()*1000;
        double r2 =array[1]+Math.random()*1000;
        double[] result = new double[2];
        result[0] = r1;
        result[1] = r2;
        return result;
    }
}

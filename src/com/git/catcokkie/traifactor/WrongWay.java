package com.git.catcokkie.traifactor;

import com.git.catcokkie.instrument.RoundTool;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class WrongWay {

    public static double[] wrongWay( double array[]){
        double r1 =array[0]+Math.random()*1000;
        double r2 =array[1]+Math.random()*1000;
        RoundTool.round(r1,7,ROUND_HALF_UP);
        RoundTool.round(r2,7,ROUND_HALF_UP);
        double[] result = new double[2];
        result[0] = r1;
        result[1] = r2;
        return result;
    }
}

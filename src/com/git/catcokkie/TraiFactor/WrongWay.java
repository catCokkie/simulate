package com.git.catcokkie.TraiFactor;

public class WrongWay {

    public static double[] WrongWay(double array[]){
//     double r1=Math.random();
//     double r2=Math.ra


        double r1 =array[0]+Math.random()*1000;
        double r2 =array[1]+Math.random()*1000;
//        int max=20;
//        int min=10;
//        Random random = new Random();
//        double s=random.nextInt(max)%(max-min+1) + min;
//     String stringr1=""+r1;
//     String stringr2=""+r2;
//     String finnalResultWrongWay=stringr1+","+stringr2;
//     return finnalResultWrongWay;
        double[] result = new double[2];
        result[0] = r1;
        result[1] = r2;

        return result;
    }
}

package com.git.catcokkie.traifactor;

import java.util.Random;

/**
 * Description:
 * 包装生成轨迹的坐标值增加方法
 * @author Administrator
 * @date 2017-12-14
 * @see 1
 * @since 1
 */
public class RabdomTrail {
    public static double[] randomSpeed( double max, double min, double[] array ) {
        //设置随机范围 速度
        Random random = new Random();
        double s = random.nextDouble() * (max - min) + min;
        //操作数组
        double r1 = array[0] + s;
        double r2 = array[1];
        double[] result = new double[2];
        //返回结果
        result[0] = r1;
        result[1] = r2;
        return result;
    }
}

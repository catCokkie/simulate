package com.git.catcokkie.traifactor;

import java.util.Random;
/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see 1
 * @since 1
 * @version 1
 */
public class Walk {
    public static double[] walk( double[] array ) {
        //设置随机范围 速度
        double max = 0.000025025;
        double min = 0;
        return RabdomTrail.randomSpeed(max, min, array);
    }
}

package com.git.catcokkie.traifactor;
/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see 1
 * @since 1
 * @version 1
 */
public class Stay {
    public static double[] stay( double array[] ) {
        double max = 0.000000005;
        double min = 0.000000005;
        return RabdomTrail.randomSpeed(max, min, array);
    }
}

package com.git.catcokkie.traifactor;

import java.util.Random;

/**
 * @author qqqq
 */
public class Ride {
    public static double[] ride( double[] array ) {
        double max = 0.000025025;
        double min = 0.000075075075;
        return RabdomTrail.randomSpeed(max, min, array);
    }
}

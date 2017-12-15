package com.git.catcokkie.test;

import com.git.catcokkie.instrument.LocationUtils;
import org.junit.Test;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see
 * @since
 */
public class Demo1Test {

    @Test
//    public void testAbc() {
//        System.out.println("testAbc...");
//    }
    public void testA() {
        double lat1 = 0.0001466;
        double lng1 = 0;
        double lat2 = 0.0000122;
        double lng2 = 0;
        System.out.println(LocationUtils.getDistance(lat1, lng1, lat2, lng2));
    }
}

package com.git.catcokkie.test;

import com.git.catcokkie.instrument.LocationUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see
 * @since
 */
public class DemoTest {

    @Test
    public void testDemo() {
//        int a = 1;
//        int b = 2;
//        Assert.assertEquals(3, a + b);
//        Assert.assertEquals(4, a + b);
        double result = LocationUtils.getDistance(0, 0, 0, 0);
        Assert.assertEquals(0, result, 0.001);
    }
}

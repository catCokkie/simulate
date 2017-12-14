package com.git.catcokkie.instrument;

import java.math.BigDecimal;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see
 * @since
 */
public class RoundTool {
    /**
     * 对double数据进行取精度.
     * @param value double数据.
     * @param scale 精度位数(保留的小数位数).
     * @param roundingMode 精度取值方式.
     * @return 精度计算后的数据.
     */
    public static double round(double value, int scale, int roundingMode) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, roundingMode);
        return  bd.doubleValue();
    }
}

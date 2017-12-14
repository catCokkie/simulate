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
public class Drive {
//        public static double[] drive=new  double[2];

    /**
     * @param array 输入原始坐标
     * @return 返回驾驶后坐标数组
     */
    public static double[] drive( double[] array ) {
        //速度-坐标转换极值
        double max = 0.000375375376;
        double min = 0.000075075075;
        return RabdomTrail.randomSpeed(max, min, array);
    }
}

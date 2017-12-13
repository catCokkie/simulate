package com.git.catcokkie.instrument;

import java.math.BigDecimal;
import java.util.Arrays;

import static javafx.scene.input.KeyCode.M;

public class MillerCoordinate {

    public static double[] MillierConvertion( double lat, double lon ) {
        double L = 6381372 * Math.PI * 2;//地球周长
        double W = L;// 平面展开后，x轴等于周长
        double H = L / 2;// y轴约等于周长一半
        double mill = 2.3;// 米勒投影中的一个常数，范围大约在正负2.3之间
        double x = lat * Math.PI / 180;// 将经度从度数转换为弧度
        double y = lon * Math.PI / 180;// 将纬度从度数转换为弧度
        x = 1.25 * Math.log(Math.tan(0.25 * Math.PI + 0.4 * y));// 米勒投影的转换
        // 弧度转为实际距离
        x = (W / (2 * Math.PI)) * x;
        y = 0 - (H / (2 * mill)) * y;
        double[] result = new double[2];
        result[0] = x;
        result[1] = y;

        return result;
    }
}




package com.git.catcokkie.instrument;

public class RandomNumber {
    /**
     * JAVA 返回随机数，并根据概率、比率
     */

    /**
     * 0-误差 出现的概率为%0.1
     */
    public static final double RATE_0 = 0.002;
    /**
     * 1-缺失 出现的概率为%0.1
     */
    public static final double RATE_1 = 0.110;
    /**
     * 2-停留 出现的概率为%9.8
     */
    public static final double RATE_2 = 0.221;
    /**
     * 3-步行 出现的概率为%30
     */
    public static final double RATE_3 = 0.221;
    /**
     * 4-骑行 出现的概率为%30
     */
    public static final double RATE_4 = 0.225;
    /**
     * 5 乘车 出现的概率为%30
     */
    public static final double RATE_5 = 0.21;

    /**
     * Math.random()产生一个double型的随机数，判断一下
     */
    public static int percentageRandom() {
        double randomNumber= Math.random();
        if (randomNumber >= 0 && randomNumber <= RATE_0) {
            return 0;
        } else if (randomNumber >= RATE_0 / 100 && randomNumber <= RATE_0 + RATE_1) {
            return 1;
        } else if (randomNumber >= RATE_0 + RATE_1
                && randomNumber <= RATE_0 + RATE_1 + RATE_2) {
            return 2;
        } else if (randomNumber >= RATE_0 + RATE_1 + RATE_2
                && randomNumber <= RATE_0 + RATE_1 + RATE_2 + RATE_3) {
            return 3;
        } else if (randomNumber >= RATE_0 + RATE_1 + RATE_2 + RATE_3
                && randomNumber <= RATE_0 + RATE_1 + RATE_2 + RATE_3 + RATE_4) {
            return 4;
        } else if (randomNumber >= RATE_0 + RATE_1 + RATE_2 + RATE_3 + RATE_4
                && randomNumber <= RATE_0 + RATE_1 + RATE_2 + RATE_3 + RATE_4
                + RATE_5) {
            return 5;
        }
        return -1;
    }
}

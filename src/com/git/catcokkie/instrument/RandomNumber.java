package com.git.catcokkie.instrument;

public class RandomNumber {
    /**
     * JAVA 返回随机数，并根据概率、比率

     */

        /**
         * 0-误差 出现的概率为%0.1
         */
        public static double rate0 = 0.002;
        /**
         * 1-缺失 出现的概率为%0.1
         */
        public static double rate1 = 0.110;
        /**
         * 2-停留 出现的概率为%9.8
         */
        public static double rate2 = 0.221;
        /**
         * 3-步行 出现的概率为%30
         */
        public static double rate3 = 0.221;
        /**
         * 4-骑行 出现的概率为%30
         */
        public static double rate4 = 0.225;
        /**
         * 5 乘车 出现的概率为%30
         */
        public static double rate5 = 0.21;

        /**
         * Math.random()产生一个double型的随机数，判断一下
         *  int
         */
        public static int PercentageRandom()
        {
            double randomNumber;
            randomNumber = Math.random();
            if (randomNumber >= 0 && randomNumber <= rate0)
            {
                return 0;
            }
            else if (randomNumber >= rate0 / 100 && randomNumber <= rate0 + rate1)
            {
                return 1;
            }
            else if (randomNumber >= rate0 + rate1
                    && randomNumber <= rate0 + rate1 + rate2)
            {
                return 2;
            }
            else if (randomNumber >= rate0 + rate1 + rate2
                    && randomNumber <= rate0 + rate1 + rate2 + rate3)
            {
                return 3;
            }
            else if (randomNumber >= rate0 + rate1 + rate2 + rate3
                    && randomNumber <= rate0 + rate1 + rate2 + rate3 + rate4)
            {
                return 4;
            }
            else if (randomNumber >= rate0 + rate1 + rate2 + rate3 + rate4
                    && randomNumber <= rate0 + rate1 + rate2 + rate3 + rate4
                    + rate5)
            {
                return 5;
            }
            return -1;
        }
    }

package com.git.catcokkie.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NowString {
    static NowString s1=new NowString();
    public static long nowStringTime=NowString();
    public static long NowString(){
                SimpleDateFormat df= new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
                String SendTime=df.format(new Date());
                long nowTime=Long.parseLong(SendTime);
                return nowTime;
            }

}

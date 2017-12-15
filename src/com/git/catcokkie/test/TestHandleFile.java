package com.git.catcokkie.test;

import com.git.catcokkie.instrument.CalculateSpeed;
import com.git.catcokkie.instrument.FileReader;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see null
 * @since since
 */
public class TestHandleFile {
    /**
     *lines 读取整个文件置于数组Lines中
     */
    public static String[] lines = new FileReader
            ("E:\\ simulate\\a\\a.txt", "UTF-8").getLines();

    public static void main( String[] args ) {
        CalculateSpeed.calculateSpeed(lines);
        System.out.println("Finish");
    }
}

package com.git.catcokkie.test;

import com.git.catcokkie.instrument.FileReader;
import com.git.catcokkie.instrument.TrailRecognition;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see 1
 * @since 1
 * @version 1.0
 */
public class TestHandleTrail {
    /**
     * lines 更新速度后并读取的数组
     */
    public static String[] newLines = new FileReader
            ("E:\\ simulate\\a\\withSpeed.txt", "UTF-8").getLines();

    public static void main( String[] args ) {
        TrailRecognition.trailRecognitionRemoveWrong();
        System.out.println("Remove Wrong Finished");
        TrailRecognition.trailRecognitionSelectDeficiencyTrail();
        System.out.println("Findout Deficiency Finished");
        TrailRecognition.trailRecognitionRemoveStay();
        System.out.println("Findout Stay Finished");
        TrailRecognition.trailRecognition();
        System.out.println("all Finished");
    }
}

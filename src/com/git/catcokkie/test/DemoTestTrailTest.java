package com.git.catcokkie.test;

import com.git.catcokkie.instrument.TrailRecognition;
import org.junit.Test;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see
 * @since
 */
public class DemoTestTrailTest {
    @Test
    public void testTrail(){
       TrailRecognition.trailRecognitionRemoveWrong();
       TrailRecognition.trailRecognitionSelectDeficiencyTrail();
        TrailRecognition.trailRecognitionRemoveStay();
    }
}

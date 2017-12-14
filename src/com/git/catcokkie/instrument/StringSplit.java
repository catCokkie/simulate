package com.git.catcokkie.instrument;

/**
 * Description:
 *
 * @author Administrator
 * @date
 */
public class StringSplit {
    public StringSplit( String a ) {

    }

    public static void main( String[] args ) {
        String[] lines = new FileReader("E:\\ simulate\\a\\b.txt", "GBK").getLines();
        String[] testArray = lines[0].split(",");
        for (int j = 0; j <= lines.length; j++) {
            System.out.println("" + testArray);
        }
    }
}

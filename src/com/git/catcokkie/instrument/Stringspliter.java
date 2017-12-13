package com.git.catcokkie.instrument;

/**
 * Description:
 *
 * @author Administrator
 * @Time
 */
public class Stringspliter {
    public Stringspliter( String a ) {

    }
//     public static String[] stringSpliter(String a){
//        String[] strarray=a.split(",");
//        return strarray;
//     }

    public static void main( String[] args ) {
        String[] lines = new FileReader("E:\\ simulate\\a\\b.txt", "GBK").getLines();
        String[] testArray = lines[0].split(",");
        for (int j = 0; j <= lines.length; j++) {
            System.out.println("" + testArray);
        }
    }
}

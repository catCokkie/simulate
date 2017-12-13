package com.git.catcokkie.instrument;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Administrator
 * @Time
 */
public class FileReader {
    //定义用于接受的队列
    private ArrayList<String> lines = null;

    //定义方法读取
    public FileReader( String filepath, String charsetName ) {
        lines = new ArrayList<String>();
        read(filepath, charsetName);
    }

    //定义读取并赋值操作
    private void read( String filePath, String charsetName ) {
        Scanner sc = null;
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, charsetName);
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }

    //按行读取
    public String[] getLines() {
        return lines.toArray(new String[lines.size()]);
    }

    /*
       文件读取样例
     */
//    public static void main(String[] args){
//        String[] lines =new FileReader("E:\\ simulate\\a\\b.txt","GBK").getLines();
//        for (int i=0;i<lines.length;i++){
//            System.out.println(lines[i]);
//        }
}


package com.git.catcokkie.instrument;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see 1
 * @since 1
 * @version 1
 */
public class FileReader {
    /**
     * 定义用于接受的队列
     */
    private List<String> lines = null;

    /**
     * 定义方法读取
     * @param filepath 文件路径
     * @param charsetName 编码格式
     */
    public FileReader( String filepath, String charsetName ) {
        lines = new ArrayList<String>();
        read(filepath, charsetName);
    }

    /**
     *定义读取并赋值操作
     * @param filePath 文件路径
     * @param charsetName 编码格式
     */
    private void read( String filePath, String charsetName ) {

        Scanner sc = null;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
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
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // ignore it.
                }
            }
        }

    }

    /**
     * 按行读取
     * @return lines
     */
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


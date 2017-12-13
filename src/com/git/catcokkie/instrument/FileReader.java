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
    private ArrayList<String> lines=null;

    public FileReader(String filepath,String charsetName){
        lines = new ArrayList<String>();
        read(filepath,charsetName);
    }

    private void read(String filePath,String charsetName){
        Scanner sc=null;
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, charsetName);
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();

        }finally {
            if(sc!=null){
                sc.close();
            }
        }

    }
    public String[] getLines(){
        return lines.toArray(new String[lines.size()]);
    }

    public static void main(String[] args){
        String[] lines =new FileReader("E:\\ simulate\\a\\b.txt","GBK").getLines();
        for (int i=0;i<lines.length;i++){
            System.out.println(lines[i]);
        }
    }
}

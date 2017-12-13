package com.git.catcokkie.fileoperator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



import static com.git.catcokkie.test.NowString.nowStringTime;


public class FileOperator {


    public static void FileOperator(String s) throws IOException {
        File file1 = new File("E:\\ simulate\\a");
        // Windows下面的路径格式类似" C:\\test\\  "
            file1.mkdir(); // 文件夹   的创建 创建文件夹/home/a123/a
        File file2 = new File("E:\\ simulate\\a\\a.txt");

            try {
                file2.createNewFile(); // 文件的创建，注意与文件夹创建的区别
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // 下面是向文件file2里面写数据
            try {
                FileWriter fileWriter = new FileWriter(file2, true);
                fileWriter.write(s);
                fileWriter.close(); // 关闭数据流
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        /*
         * 如果不想删除以前的数据，而是把新增加的内容增添在文件末尾处。只需要在创建FileWriter对象时候，使用另外一个构造函数即可：
         * FileWriter fileWriter=new FileWriter(file2，true);
         */
    }


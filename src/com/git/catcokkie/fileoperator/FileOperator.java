package com.git.catcokkie.fileoperator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileOperator {

    /**
     * 输出原始数据
     * @param s 待打印内容
     * @throws IOException 抛出异常
     */
    public static void fileOperatorA( String s) throws IOException {
        creatAndWriteFile(s, "E:\\ simulate\\a\\a.txt");
    }
    /**
     * 输出计算速度后数据
     * @param s 待打印内容
     * @throws IOException 抛出异常
     */
    public static void fileOperatorC( String s) throws IOException {
        creatAndWriteFile(s, "E:\\ simulate\\a\\withSpeed.txt");
    }
    /**
     * 输出抛出速度异常后数据
     * @param s 待打印内容
     * @throws IOException 抛出异常
     */
    public static void fileOperatorD( String s) throws IOException {
        creatAndWriteFile(s, "E:\\ simulate\\a\\withoutWrong.txt");
    }
    /**
     * 输出抛出轨迹缺失的数据
     * @param s 待打印内容
     * @throws IOException 抛出异常
     */
    public static void fileOperatorE( String s) throws IOException {
        creatAndWriteFile(s, "E:\\ simulate\\a\\deficiencyTrail.txt");
    }

    /**
     * 输出抛出轨迹缺失的数据
     * @param s 待打印内容
     * @throws IOException 抛出异常
     */
    public static void fileOperatorF( String s) throws IOException {
        creatAndWriteFile(s, "E:\\ simulate\\a\\stayTrail.txt");
    }
    /**
     * 输出抛出轨迹缺失的数据
     * @param s 待打印内容
     * @throws IOException 抛出异常
     */
    public static void fileOperatorWalk( String s) throws IOException {
        creatAndWriteFile(s, "E:\\ simulate\\a\\walkTrail.txt");
    }
    /**
     * 输出抛出轨迹缺失的数据
     * @param s 待打印内容
     * @throws IOException 抛出异常
     */
    public static void fileOperatorDrive( String s) throws IOException {
        creatAndWriteFile(s, "E:\\ simulate\\a\\driveTrail.txt");
    }
    /**
     * 输出抛出轨迹缺失的数据
     * @param s 待打印内容
     * @throws IOException 抛出异常
     */
    public static void fileOperatorRide( String s) throws IOException {
        creatAndWriteFile(s, "E:\\ simulate\\a\\rideTrail.txt");
    }
    private static void creatAndWriteFile( String s, String pathname2 ) {
        File file1 = new File("E:\\ simulate\\a");
        // Windows下面的路径格式类似" C:\\test\\  "
        file1.mkdir(); // 文件夹   的创建 创建文件夹/home/a123/a
        File file2 = new File(pathname2);

        try {
            file2.createNewFile(); // 文件的创建，注意与文件夹创建的区别
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // writeToFile
        writeToFile(s, file2);
    }

    private static void writeToFile( String s, File file2 ) {
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


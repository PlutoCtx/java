package com.example.java.classworkin2022.softwarequalityandtest.experiments.exp01_BoundaryValueAnalysis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 输入三角形三边，判断是否构成三角形以及构成的三角形类型
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/25 18:19
 * @since JDK17
 */

public class Triangle {



    public static boolean isTriangle(int a, int b, int c){
        if (!(a + b < c) && !(b + c < a) && !(a + c < b)){
            System.out.println("构成三角形");

        }

        return true;
    }

//    public static void main(String[] args) {
//
////        boolean a;
////        if (isTriangle(2, 4, 5)) a = true;
////        else a = false;
//        System.out.println("   " + isTriangle(2,4,6));
//    }


    /**
     * 读取一个文本 一行一行读取
     *
     * @param path
     * @return
     * @throws IOException
     */
    public static List<String> readFile02(String path) throws IOException {
        // 使用一个字符串集合来存储文本中的路径 ，也可用String []数组
        List<String> list = new ArrayList<String>();
        FileInputStream fis = new FileInputStream(path);
        // 防止路径乱码   如果utf-8 乱码  改GBK     eclipse里创建的txt  用UTF-8，在电脑上自己创建的txt  用GBK
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String line = "";
        while ((line = br.readLine()) != null) {
            // 如果 t x t文件里的路径 不包含---字符串       这里是对里面的内容进行一个筛选
            if (line.lastIndexOf("---") < 0) {
                list.add(line);
            }
        }
        br.close();
        isr.close();
        fis.close();
        return list;
    }

    public static void main(String[] args) {
        // 文件夹路径
        String path = "D:\\triangles.txt";
        try {
            List<String> scanListPath = readFile02(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }








}

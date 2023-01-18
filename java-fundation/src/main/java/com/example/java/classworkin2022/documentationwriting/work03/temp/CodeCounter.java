package com.example.java.classworkin2022.documentationwriting.work03.temp;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;

/**
 * 程序计数器
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/17 19:13
 * @since JDK17
 */

public class CodeCounter {

    /**
     * 代码行数统计
     */
    public static void main(String[] args) {
        String file = CodeCounter.class.getResource("/").getFile();
        String path = file.replace("target/test-classes","src");

        ArrayList<File> arrayList = getFile(new File(path));
        for (File f : arrayList) {
            if (f.getName().matches(".*\\.java$")) {
                count(f);
                System.out.println(f);
            }
        }
        System.out.println("统计文件：" + files);
        System.out.println("代码行数: " + codeLines);
        System.out.println("注释行数：" + commentLines);
        System.out.println("空白行数：" + blankLines);
    }

    static long files = 0;
    static long codeLines = 0;
    static long commentLines = 0;
    static long blankLines = 0;
    static ArrayList<File> fileArrayList = new ArrayList<File>();

    /**
     * 获取文件及目录下的子文件
     * @param file 代码文件
     * @return
     */
    public static ArrayList<File> getFile(@NotNull File file){
        File[] listFiles = file.listFiles();
        for (File child : listFiles) {
            if (child.isDirectory()) {
                getFile(child);
            }else {
                fileArrayList.add(child);
            }
        }
        return fileArrayList;
    }




    private static void count(File file){
        BufferedReader bufferedReader = null;
        boolean flag = false;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                line = line.trim();     //除去注释前的空格
                if (line.matches("^[ ]*$")){    //匹配空行
                    blankLines++;
                } else if (line.startsWith("//")){
                    commentLines ++;
                } else if (line.startsWith("/*") && !line.endsWith("*/")) {
                    commentLines ++;
                    flag = true;
                } else if (line.startsWith("/*") && line.endsWith("*/")) {
                    commentLines ++;
                } else if (flag == true) {
                    commentLines ++;
                    if (line.endsWith("*/")){
                        flag = false;
                    }
                }else {
                    codeLines ++;
                }
            }
            files ++;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (bufferedReader != null){
                try{
                    bufferedReader.close();
                    bufferedReader = null;
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}












































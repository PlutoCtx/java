package com.example.java.classworkin2022.softwarequalityandtest.experiments.exp01_BoundaryValueAnalysis;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 消息输出问题 实验四
 *
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/11/30 23:48
 * @since JDK17
 */

public class MessageOutputs {

    /**
     * 判断输入字符是否为数字
     * @param str   带监测字符串
     * @return  若为数字，返回true，反之返回false
     */
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*#");
        Matcher isNum = pattern.matcher(str);
        if (! isNum.matches()){
            return false;
        }
        return true;
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/softwarequalityandtest/CausalityDiagram/MessageOutput.csv")
    void messageOutput(String a, String b){
        if (a.equals("*") || a.equals("#")){
            if (isNumeric(b)){
                System.out.println("************************************");
                System.out.printf(a + "    " +  b + "    "  + "文档被修改\n");
            }else {
                System.out.println("************************************");
                System.out.printf(a + "    " +  b + "    "  + "M\n");
            }
        }else {
            System.out.println("************************************");
            System.out.printf(a + "    " +  b + "    "  + "N\n");
        }
    }

}

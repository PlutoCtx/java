package com.example.java.classworkin2022.softwarequalityandtest.homework.task01.attempt01;

/**
 * 计算器
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/14 19:08
 * @since JDK17
 */

public class Calculator {
    public int result=0;
    public int add(int operand1,int operand2){
        result=operand1+operand2;   //将两个传入参数进行相加操作
        return result;
    }
    public  int subtract(int operand1,int operand2){
        result=operand1-operand2;   //将两个传入参数进行相减操作
        return  result;
    }
    public int multipe(int operand1,int operand2){
        result=operand1*operand2;   //将两个传入参数进行相乘操作
        for(;;){                    //死循环
        }
    }
    public int divide(int operand1,int operand2){
        result=operand1/0;      //除0操作
        return result;
    }
    public int getResult(){
        return this.result;     //返回计算结果
    }

}



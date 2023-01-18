package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 11:29
 * @since JDK17
 */

public class CsvSourceDemoTest {
    @ParameterizedTest // 1.使用此注解声明是-个参数化的测试类
    // 2.使用CsvSource注解传递参数化数据，传递的参数格式是一个集合，
    //如果是多个参数，使用默认分隔符"，"分开
    @CsvSource({"哈利,2","赫敏,22","罗恩,12"})
    void csvSourceDemo (String name , Integer age){
        System.out.println(name+ "的年龄是:"+age);
    }

    @ParameterizedTest
    // 使用 delimiterString 指定分隔符，使用 value 指定数据源
    @CsvSource(value = {"哈利-2","赫敏-22","罗恩-12"}, delimiterString = "-")
    void csvSourceDemo02 (String name , Integer age){
        System.out.println(name+ "的年龄是:"+age);
    }



}

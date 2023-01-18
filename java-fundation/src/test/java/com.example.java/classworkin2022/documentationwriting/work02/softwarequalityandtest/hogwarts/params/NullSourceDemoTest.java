package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 19:05
 * @since JDK17
 */

public class NullSourceDemoTest {

    // 1.声明一个参数化的测试方法
    // 2.使用 NullSource 注解
    // 3.定义一个String 类型的形式
    @ParameterizedTest
    @NullSource
    void nullSourceDemo(String param){
        System.out.println(param);
    }





}

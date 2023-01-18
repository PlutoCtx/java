package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * MultipleMethodSourceDemoTest
 * 多参数使用数据的方法
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 17:19
 * @since JDK17
 */


public class MultipleMethodSourceDemoTest {

    /**
     *
     * @MethodSource("objectProvider") 指定方法名
     * @param name 从方法中来
     * @param age 从方法中来
     */
    @ParameterizedTest
    @MethodSource("objectProvider")
    void methodSourceDemo(String name, Integer age){
        System.out.println(name + "的年龄是： " + age);
    }

    static Stream<Arguments> objectProvider(){
        return Stream.of(
                Arguments.arguments("Lane", 12),
                Arguments.arguments("Max", 25),
                Arguments.arguments("CMC", 54)
        );
    }


    /**
     * @MethodSource 未指定方法名
     * @param name 从方法中来
     * @param age 从方法中来
     */
    @ParameterizedTest
    @MethodSource
    void methodSourceDemo02(String name, Integer age){
        System.out.println(name + "的年龄是： " + age);
    }

    static Stream<Arguments> methodSourceDemo02(){
        return Stream.of(
                Arguments.arguments("Lane", 12),
                Arguments.arguments("Max", 25),
                Arguments.arguments("CMC", 54)
        );
    }


}

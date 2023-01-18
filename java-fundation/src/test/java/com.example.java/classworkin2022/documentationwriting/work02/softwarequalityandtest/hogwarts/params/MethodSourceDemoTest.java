package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 17:06
 * @since JDK17
 */

public class MethodSourceDemoTest {

    // 1.ParameterizedTest声明一个测试方法
    @ParameterizedTest
    @MethodSource("stringProvider02") // 2.通过MethodSource("")指定数据源的方法名
//    @MethodSource // 如果不加参数，那么会找和测试方法名称相同的静态方法
    // 4.添加形参，形参的类型要和静态方法内部的元素类型一致
    void methodSourceDemo(String name){
        System.out.println(name);
    }

    // 3.定义一个静态方法，提供参数化数据源
    static Stream<String> stringProvider(){
        return Stream.of("芒果","菠萝");
    }


    static Stream<String> methodSourceDemo(){
        return Stream.of("苹果","香蕉");
    }



    static Stream<String> stringProvider02(){
//
//        MySQLDruid mySQLDruid = new MySQLDruid();
//        try {
//            mySQLDruid.getData();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return Stream.of("芒果","菠萝");

    }

}

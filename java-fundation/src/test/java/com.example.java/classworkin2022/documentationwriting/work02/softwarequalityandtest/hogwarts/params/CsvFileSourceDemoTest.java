package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * CsvFileSourceDemoTest
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 16:18
 * @since JDK17
 */

public class CsvFileSourceDemoTest {


    /**
     * 使用默认的分隔符","
     * @param name 名字   来自于data.csv(resource中)
     * @param age 年龄
     */
    @ParameterizedTest // 1.声明参数化测试类
    // 2.使用 CsvFileSource 注解声明参数化数据， 使用关键字resources指定文件
    // 注意:文件名前面需要加 /
    @CsvFileSource(resources = "/data/data.csv")
    // 给测试方法添加形参
    void csvSourceDemo01 (String name , Integer age){
        System.out.println(name+ "的年龄是:"+age);
    }


    /**
     * 使用自定义的分隔符"|"
     * @param name 名字   来自于data02.csv(resource中)
     * @param age 年龄
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/data02.csv", delimiterString = "|")
    void csvSourceDemo02 (String name , Integer age){
        System.out.println(name+ "的年龄是:"+age);
    }


}

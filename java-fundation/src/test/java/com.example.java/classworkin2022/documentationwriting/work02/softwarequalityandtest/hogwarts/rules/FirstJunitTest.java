package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.rules;

import org.junit.jupiter.api.Test;

/**
 * Junity测试
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 9:00
 * @since JDK17
 */

public class FirstJunitTest {

    //第一个测试用例，所有的测试用例都需要添加@Test注解
    @Test
    void first(){
        System.out.println("第一个Junit5测试用例");
    }

    @Test
    void second(){
        System.out.println("第二个Junit5测试用例");
    }



}

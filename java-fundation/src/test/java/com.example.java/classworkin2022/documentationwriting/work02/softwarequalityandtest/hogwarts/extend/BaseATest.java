package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.extend;

import org.junit.jupiter.api.*;

/**
 * 父类
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 16:38
 * @since JDK17
 */

public class BaseATest {

    @BeforeAll
    static void beforeAAll(){
        System.out.println("BaseATest----beforeAAll");
    }
    @AfterAll
    static void afterAAlL(){
        System.out.println("BaseATest----afterAAll");
    }
    @BeforeEach
    void beforeAEach(){
        System.out.println("BaseATest----beforeAEach");
    }
    @AfterEach
    void afterAEach(){
        System.out.println("BaseATest----afterAEach");
    }

    @Test
    void test01A(){
        System.out.println("BaseATest----test01A测试用例");
    }

    @Test
    void test02A(){
        System.out.println("BaseATest----test02A测试用例");
    }



}

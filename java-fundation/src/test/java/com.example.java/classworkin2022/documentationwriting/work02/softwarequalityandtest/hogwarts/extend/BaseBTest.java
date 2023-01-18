package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.extend;

import org.junit.jupiter.api.*;

/**
 * 父类
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 16:38
 * @since JDK17
 */
//让B继承A
public class BaseBTest extends BaseATest{

    @BeforeAll
    static void beforeBAll(){
        System.out.println("BaseBTest----beforeBAll");
    }
    @AfterAll
    static void afterBAlL(){
        System.out.println("BaseBTest----afterBAll");
    }
    @BeforeEach
    void beforeBEach(){
        System.out.println("BaseBTest----beforeBEach");
    }
    @AfterEach
    void afterBEach(){
        System.out.println("BaseBTest----afterBEach");
    }

    @Test
    void test01B(){
        System.out.println("BaseBTest----test01B测试用例");
    }

    @Test
    void test02B(){
        System.out.println("BaseBTest----test02B测试用例");
    }



}

package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 11:08
 * @since JDK17
 */

public class AssertThrowsDemoTest {


    void fn(int a,int b){
        System.out.println(a / b);
    }

    @Test
    void testAssertThrows(){
        //异常断言
        assertThrows(ArithmeticException.class,() -> fn(1,1));
    }


}

package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * AssertTrue
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 10:35
 * @since JDK17
 */

public class AssertTrueTest {
    @Test
    void expressionDemo(){
        System.out.println("断言表达式为True");
        assertTrue(3 > 1);
    }

    @Test
    void boolDemo(){
        System.out.println("断言布尔类型");
        assertTrue(true);
    }
}

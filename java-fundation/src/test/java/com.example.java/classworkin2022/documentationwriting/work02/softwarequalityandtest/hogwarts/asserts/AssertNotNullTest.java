package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 10:44
 * @since JDK17
 */

public class AssertNotNullTest {
    @Test
    void nullDemo(){
        System.out.println("断言传值为空的场景");
        assertNotNull("4564");
    }

    @Test
    void notNullDemo(){
        System.out.println("断言传值不为空的场景");
        assertNotNull(1);
    }
}

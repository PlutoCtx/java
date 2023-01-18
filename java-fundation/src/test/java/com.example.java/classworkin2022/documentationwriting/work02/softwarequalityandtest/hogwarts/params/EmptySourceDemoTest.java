package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 19:06
 * @since JDK17
 */

public class EmptySourceDemoTest {

    @ParameterizedTest
    @EmptySource
    void emptySourceTest(String param){
        System.out.println(param);

    }



    @ParameterizedTest
    @NullAndEmptySource
    void nullAndEmptySourceTest(String param){
        System.out.println(param);

    }





}

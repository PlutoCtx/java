package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 断言测试
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 10:32
 * @since JDK17
 */

public class AssertEqTest {
    @Test
    void hogwarts(){
        //断言添加成功
        //第一个参数表示预期结果，第二个参数表示实际结果
        assertEquals(2,1 + 1);
        System.out.println("断言测试");
    }

}

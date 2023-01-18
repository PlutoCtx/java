package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/10/20 10:50
 * @since JDK17
 */

public class AssertAllTest {
    @Test
    void hogwarts(){
        System.out.println("断言测试");

        assertEquals(2,1);
        System.out.println("2,1");
        assertEquals(3,1 + 1);
        System.out.println("2,1");
        assertEquals(1,2);
        System.out.println("1,2");
    }


    @Test
    void assertAllDemo(){
        System.out.println("断言测试 AssertAll");
        // 分组断言，如果一个用例存在多个断言，使用assertAll可以执行每个断言，且返回结果
        // 第一个heading 参数是一个描述信息，代表了这个分组断言是针对什么场景，也可以不传
        assertAll("All",
                () -> assertEquals(2,1+1),
                () -> assertEquals(3,1+1),
                () -> assertEquals(4,1+1)

                );
    }


    @Test
      void standardAssertions() {
      assertEquals(2, 2);
      assertEquals(4, 5, "出错了");
      }
//          @Test
//          void groupedAssertions() {
//          // In a grouped assertion all assertions are executed, and any
//          // failures will be reported together.
//          assertAll("person",
//                          () -> assertEquals("John", person.getFirstName()),
//          () -> assertEquals("Doe", person.getLastName())
//          );
//      }





}

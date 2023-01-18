package com.example.java.classworkin2022.documentationwriting.work02;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * All 和 Each 的区别
 * 1.All在一个测试类中只执行一次，但Each是有多少个方法就执行几次
 * 2.All注解修饰static方法，不能修饰普通方法（否则会报错），但Each可以
 * 3.如果是BeforeAll 和 BeforeEach 同时存在，优先执行 BeforeAll
 * 4.如果是AfterAll 和 AfterEach 同时存在，优先执行 AfterEach,最后执行 AfterAll
 *
 */
class CodeCounter02Test {


    //前置条件

    /**
     * Test ignored.
     *
     * org.junit.platform.commons.JUnitException:
     * @BeforeAll method 'void com.example.java.classworkin2022.documentationwriting.work02.CodeCounter02Test.setUpAll()'
     * must be static unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).
     *
     */
    @BeforeAll
    static void setUpAll() {
        System.out.println("在所有用例执行之前的前置动作1");
    }

    //后置条件/动作
    @AfterAll
    static void tearDownAll() {
        System.out.println("在所有用例执行之后的后置动作5");
    }


    //前置条件
    @BeforeEach
    void setUp() {
        System.out.println("在每条用例之前执行的前置动作2");
    }

    //后置条件/动作
    @AfterEach
    void tearDown() {
        System.out.println("在每条用例结束之后执行的后置动作4");
    }

    @Test       //测试标题
    @DisplayName("CodeCounter02的第一条用例")     //给测试方法添加一个别名
    void main() {
        //测试方法里的所有操作都属于测试步骤
        System.out.println("CodeCounter02的第一条测试用例3");


        //断言添加成功
        //第一个参数表示预期结果，第二个参数表示实际结果
        assertEquals(2,1 + 1);
//        assertTrue();
//        assertNotNull();
//        assertAll();
//        assertThrows()


    }
}
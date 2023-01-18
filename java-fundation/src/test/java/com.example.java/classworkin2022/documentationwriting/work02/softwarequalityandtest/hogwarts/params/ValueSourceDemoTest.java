package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 11:19
 * @since JDK17
 */

public class ValueSourceDemoTest {

    // @Test 尽量不要将@Test和@ParameterizedTest结合使用，如果使用，这用例多执行一次
    // 1.将Test注解换为ParameterizedTest注解
    //声明测试类是-个参数化的测试类
    @ParameterizedTest
    // 2.传递测试数据
    //使用单参数注解@VolueSource传递》数化的数据内容
    //传递参数的过程中，需要通过VolueSource定 义的关键字进行类型声明
    @ValueSource(strings = {"张三","李四","王五"})
//    @ValueSource(ints = {1,3,5,7,9})
    // 3.在测试方法上面添加形参，接受参数化的数据
    void valueSourceDemo(String name){
        System.out.println(name);
        //断言数据的长度是否等于2
        assertEquals(name.length(),2);

    }
}

package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 18:45
 * @since JDK17
 */

public class EnumSourceDemoTest {

    // 1.定义枚举类
    public enum HogwartsUnity{
        People("People",25),
        Joker("Joker",56),
        Lane("Lane",45),
        Max01("Max01",76),
        Max02("Max02",76),
        Brooks("Brooks",35);

        private final String name;
        private final Integer age;
        private HogwartsUnity(String name, Integer age){
            this.name = name;
            this.age = age;
        }
    }

    // 2.对测试方法添加 ParameterizedTest 和 EnumSource 注解
    @ParameterizedTest
    @EnumSource
    // 3.测试方法的形参声明类型是定义的枚举类
    void enumSourceDemo(HogwartsUnity unity){
        System.out.println(unity.name + "的年龄是：" + unity.age);
    }


    @ParameterizedTest
    //通过names关键字指定枚举对象的范围
    @EnumSource(names = {"People", "Joker"})
        // 3.测试方法的形参声明类型是定义的枚举类
    void enumSourceDemo02(HogwartsUnity unity){
        System.out.println(unity.name + "的年龄是：" + unity.age);
    }


    @ParameterizedTest
    //通过names关键字指定枚举对象的范围
    //通过 mode 关键字指定规则，EXCLUDE 规则表示取反
    @EnumSource(mode = EnumSource.Mode.EXCLUDE, names = {"People", "Joker"})
        // 3.测试方法的形参声明类型是定义的枚举类
    void enumSourceDemo03(HogwartsUnity unity){
        System.out.println(unity.name + "的年龄是：" + unity.age);
    }



    @ParameterizedTest
    //通过names关键字指定枚举对象的范围
    //通过 mode 关键字指定规则，MATCH_ALL 规则代表正则匹配
    // names 里面填写正则表达式，如果正则表达式和枚举类对象匹配，则使用此枚举类对象
    @EnumSource(mode = EnumSource.Mode.MATCH_ALL, names = {"Max.*"})
        // 3.测试方法的形参声明类型是定义的枚举类
    void enumSourceDemo04(HogwartsUnity unity){
        System.out.println(unity.name + "的年龄是：" + unity.age);
    }



}

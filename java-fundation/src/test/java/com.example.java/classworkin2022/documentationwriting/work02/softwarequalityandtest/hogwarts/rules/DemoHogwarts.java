package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.rules;

import org.junit.jupiter.api.Test;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 9:22
 * @since JDK17
 */

public class DemoHogwarts {

    // IDEA 并没有针对文件名做限制：虽然本测试用例不符合命名规范，但idea依旧会运行
    // 使用maven构建时，则不会收集不满足规则要求的用例
    @Test
    void demo(){
        System.out.println("测试文件DemoHogwarts");
    }

}

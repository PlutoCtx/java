package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.hogwarts.asserts;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTimeout;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 11:02
 * @since JDK17
 */

public class AssertTimeout {

    @Test
    void timeoutDemo() throws InterruptedException{

        //第一个参数传递超时时间，Duration.ofSeconds(3)表示3秒超时
        //第二个参数传递操作
        //第二个参数如果超出第一个参数限定的时间范围，那么就是超时，就会抛出异常
        assertTimeout(Duration.ofSeconds(3),()->{
            sleep(2000);
        });


    }



}

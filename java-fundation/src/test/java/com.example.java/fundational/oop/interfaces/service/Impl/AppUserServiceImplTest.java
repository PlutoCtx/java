package com.example.java.fundational.oop.interfaces.service.Impl;

import com.example.java.fundational.object.oop.interfaces.service.LogService;
import com.example.java.fundational.object.oop.interfaces.service.UserService;

/**
 * app服务用户测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:51
 */

public class AppUserServiceImplTest {
    public static void main(String[] args) {
        System.out.println(UserService.WEB_SITE_NAME);
        System.out.println(LogService.WEB_SITE_NAME);

        UserService.statistics();

    }
}

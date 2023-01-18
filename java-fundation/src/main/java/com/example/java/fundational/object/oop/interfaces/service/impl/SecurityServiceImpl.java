package com.example.java.fundational.object.oop.interfaces.service.impl;

import com.example.java.fundational.object.oop.interfaces.service.SecurityService;

/**
 * 安全用户服务
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:37
 */

public class SecurityServiceImpl implements SecurityService {
    @Override
    public void securityCheck() {
        System.out.println("网络安全检查通过...");
    }
}


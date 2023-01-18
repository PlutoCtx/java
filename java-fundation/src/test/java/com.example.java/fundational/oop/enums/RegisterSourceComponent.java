package com.example.java.fundational.oop.enums;

import com.example.java.fundational.object.oop.enums.RegisterSource;
import com.example.java.fundational.object.oop.interfaces.service.UserService;
import com.example.java.fundational.object.oop.interfaces.service.impl.AndroidUserServiceImpl;
import com.example.java.fundational.object.oop.interfaces.service.impl.IOSUserServiceImpl;
import com.example.java.fundational.object.oop.interfaces.service.impl.PCUserServiceImpl;

/**
 * 处理注册的组件
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:48
 */

public class RegisterSourceComponent {
    //    UserService userService;
//
//    /**
//     * 处理注册来源
//     * @param registerSource
//     */
//    public static void handleRegisterSource(RegisterSource registerSource){
//
//
//
//        switch (registerSource){
//            case PC:
//                userService = new PCUserServiceImpl();
//                break;
//            case ANDROID_APP:
//                userService = new AndroidUserServiceImpl();
//                break;
//            case IOS_APP:
//                userService = new IOSUserServiceImpl();
//                break;
//            case UNKNOWN:
//                System.out.println("不明来源的用户注册");
//                break;
//        }
//        userService.register();
//
//    }
    UserService userService;
    /**
     * 处理注册来源
     * @param registerSource
     */
    public void handleRegisterSource(RegisterSource registerSource){
        switch (registerSource){
            case PC :
                userService = new PCUserServiceImpl();
                break;
            case ANDROID_APP:
                userService = new AndroidUserServiceImpl();
                break;
            case IOS_APP:
                userService = new IOSUserServiceImpl();
                break;
            case UNKNOWN:
                System.out.println("不明来源的注册");
                break;
        }
        userService.register();
    }
}

package com.example.java.fundational.object.oop.interfaces.service;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:09
 */

public class BaiduDiskCallBack implements DownloadCompleteCallBack{
    @Override
    public void doloadCompleteCallBack(String data) {
        System.out.println("迅雷下载的数据是：" + data);
        System.out.println("用户存储《" + data + "》到百度网盘");
    }
}
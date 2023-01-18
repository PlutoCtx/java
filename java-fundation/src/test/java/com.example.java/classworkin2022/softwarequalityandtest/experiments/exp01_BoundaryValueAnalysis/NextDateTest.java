package com.example.java.classworkin2022.softwarequalityandtest.experiments.exp01_BoundaryValueAnalysis;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/10/25 19:47
 * @since JDK17
 */
class NextDateTest {

    /**
     * 判断单个输入值是否合法：
     * 是 -> true
     * 否 -> false
     * @param yyyy  年
     * @param MM    月
     * @param dd    日
     * @return  单个输入值是否合法
     */
    static boolean isSingleInputDataUseful(Integer yyyy, Integer MM, Integer dd){
        return (yyyy >= 1912 && yyyy <= 2050) && (MM >= 1 && MM <= 12) && (dd >= 1 && dd <= 31);
    }

    /**
     * 判断是否为闰年
     * @param yyyy  年份
     * @return 若为闰年 -> true
     */
    static boolean isLeapYear(Integer yyyy){
        return (yyyy % 400 == 0) || (yyyy % 4 == 0 && yyyy % 100 != 0);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/softwarequalityandtest/BoundaryValueAnalysis/nextdateForW-BVA-R.csv")
    void nextDate(Integer yyyy, Integer MM,Integer dd){
        if (!isSingleInputDataUseful(yyyy, MM, dd)){
//            System.out.println("*******************************");
            System.out.printf("当前日期为%4d/ %2d/ %2d  输入数据不合法\n",yyyy,MM,dd);
//            System.out.printf("%5d/ %3d/ %3d  输入数据不合法",yyyy,MM,dd);
        }else{
            //一个标志，若为真，则说明当前月的最大日数比输入的要小，输入值有问题
            boolean dayFlag = false;
            switch (MM){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (dd == 31){
                        dd = 1;
                        MM = MM + 1;
                    }else {
                        dd += 1;
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    if (dd == 30){
                        dd = 1;
                        MM += 1;
                    } else if (dd == 31) {
                        dayFlag = true;     //输入日期超出当前月的实际最大值
                    }else
                        dd += 1;
                    break;

                case 2:
                    if (isLeapYear(yyyy)){      //闰年
                        if (dd == 29){
                            dd = 1;
                            MM = 3;
                        } else if (dd < 29) {
                            dd += 1;
                        }else
                            dayFlag = true; //输入日期超出当前月的实际最大值
                    }else {         //平年
                        if (dd == 28){
                            dd = 1;
                            MM = 3;
                        }else if (dd < 28){
                            dd += 1;
                        }else
                            dayFlag = true; //输入日期超出当前月的实际最大值
                    }
                    break;

                case 12:
                    if (dd == 31){
                        dd = 1;
                        MM = 1;
                        yyyy += 1;
                    }else {
                        dd += 1;
                    }
                    break;
                default:

            }

            if (dayFlag){
//                System.out.println("*******************************");
                System.out.printf("当前日期为%4d/ %2d/ %2d  日数不合实际\n",yyyy,MM,dd);
            }else {
//                System.out.println("*******************************");
                System.out.printf("次日日期为%4d/ %2d/ %2d  测试通过\n",yyyy,MM,dd);
            }
        }
    }
}






//    /**
//     * 数据判断
//     * @param yyyy  年
//     * @param MM    月
//     * @param dd    日
//     * @return 得出测试结果
//     */
//    static boolean isAllDataUseful(Integer yyyy, Integer MM, Integer dd){
//        //一个标志，若为真，则说明当前月的最大日数比输入的要小，输入值有问题
//        boolean dayFlag = false;
//        switch (MM){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//                if (dd == 31){
//                    dd = 1;
//                    MM = MM + 1;
//                }else {
//                    dd += 1;
//                }
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                if (dd == 30){
//                    dd = 1;
//                    MM += 1;
//                } else if (dd == 31) {
//                    dayFlag = true;     //说明日期超出当前月的实际最大值
//                }else
//                    dd += 1;
//                break;
//            case 2:
//                if (isLeapYear(yyyy)){      //闰年的情况下
//                    if (dd == 29){
//                        dd = 1;
//                        MM = 3;
//                    } else if (dd < 29) {
//                        dd += 1;
//                    }else
//                        dayFlag = true;
//                }else {         //平年
//                    if (dd == 28){
//                        dd = 1;
//                        MM = 3;
//                    }else if (dd < 28){
//                        dd += 1;
//                    }else
//                        dayFlag = true;
//                }
//                break;
//
//            case 12:
//                if (dd == 31){
//                    dd = 1;
//                    MM = 1;
//                    yyyy += 1;
//                }else {
//                    dd += 1;
//                }
//                break;
//            default:
//        }
//        return true;
//    }



/*
 * 问题描述：NextDate是一个由三个变量（月份、日期和年份）的函数。函数返回输入日期后边的那个日期。
 * 作为输入：变量月份、日期和年都具有整数值，满足以下条件。
 * C1：1<=月份<=12
 * C2：1<=日期<=31
 * C3：1912<=年<=2050
 */
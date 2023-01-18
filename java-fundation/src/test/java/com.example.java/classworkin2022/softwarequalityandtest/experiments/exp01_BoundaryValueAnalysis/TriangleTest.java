package com.example.java.classworkin2022.softwarequalityandtest.experiments.exp01_BoundaryValueAnalysis;//package com.example.java.classworkin2022.softwarequalityandtest.experiments.exp01_BoundaryValueAnalysis;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//
///**
// * @author MaxBrooks chentingxian195467@163.com
// * @version 2022/10/25 19:47
// * @since JDK17
// */
//class TriangleTest {
//
//    /**
//     *  判断是否输入数据是否合法，若合法，返回true，反之返回false
//     * @param a 边1
//     * @param b 边2
//     * @param c 边3
//     * @return 返回判断值
//     */
//    static boolean isDataUseful(Integer a, Integer b,Integer c){
//        return (a >= 1 && a <= 100) && (b >= 1 && b <= 100) && (c >= 1 && c <= 100);
//    }
//
//    /**
//     * 判断输入数据能否构成三角形，若能，返回true，反之返回false
//     * @param a 边1
//     * @param b 边2
//     * @param c 边3
//     * @return 返回判断值
//     */
//    static boolean isTriangle(Integer a, Integer b,Integer c){
//        return !(a + b <= c) && !(b + c <= a) && !(a + c <= b);
//    }
//
//    /**
//     * 判断三角形类型
//     * @param a 边1
//     * @param b 边2
//     * @param c 边3
//     */
//    static void kindOfTriangle(Integer a, Integer b, Integer c){
//        if (a.equals(b) || b.equals(c) || a.equals(c)){
//            if (a.equals(b) && b.equals(c))     //没必要再添一句a.equals(c)，因为前两者的可以推导出a == c的结论
//                System.out.println("等边三角形");
//            else
//                System.out.println("等腰三角形");
//        }else
//            System.out.println("不等边三角形");
//    }
//
//
//
//
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/softwarequalityandtest/BoundaryValueAnalysis/trianglesforW-BVA-R.csv")
//    void isTriangle01(Integer a, Integer b,Integer c){
//        System.out.println("***************************");
////        System.out.print(a + " " + b + " " + c);
//        System.out.printf("%3d %3d %3d  ",a,b,c);
//
//        if (isDataUseful(a,b,c)){
//            if (isTriangle(a,b,c))
//                kindOfTriangle(a,b,c);
//            else
//                System.out.println("非三角形");
//        }else
//            System.out.println("数据不合法");
//
//    }
//}
//
//
//
//
//


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Objects;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/10/25 19:47
 * @since JDK17
 */
public class TriangleTest {
    /**
     * 判断是否是数字
     * @param a 参数a
     * @param b 参数b
     * @param c 参数c
     * @return boolean
     */
    static boolean isNumerical(String a, String b, String c){
        return !Objects.equals(a, "?") && !Objects.equals(b, "?") && !Objects.equals(c, "?");
    }

    /**
     *  判断是否输入数据是否合法，若合法，返回true，反之返回false
     * @param a 边1
     * @param b 边2
     * @param c 边3
     * @return 返回判断值
     */
    static boolean isDataUseful(Integer a, Integer b,Integer c){
        return (a >= 1 && a <= 100) && (b >= 1 && b <= 100) && (c >= 1 && c <= 100);
    }

    /**
     * 判断输入数据能否构成三角形，若能，返回true，反之返回false
     * @param a 边1
     * @param b 边2
     * @param c 边3
     * @return 返回判断值
     */
    static boolean isTriangle(Integer a, Integer b,Integer c){
        return !(a + b <= c) && !(b + c <= a) && !(a + c <= b);
    }

    /**
     * 判断三角形类型
     * @param a 边1
     * @param b 边2
     * @param c 边3
     */
    static void kindOfTriangle(Integer a, Integer b, Integer c){
        if (a.equals(b) || b.equals(c) || a.equals(c)){
            if (a.equals(b) && b.equals(c))     //没必要再添一句a.equals(c)，因为前两者的可以推导出a == c的结论
                System.out.println("等边三角形");
            else
                System.out.println("等腰三角形");
        }else
            System.out.println("不等边三角形");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/softwarequalityandtest/CausalityDiagram/CausalityDiagram.csv")
    void isTriangle02(String a, String b,String c){
        System.out.println("***************************");
        System.out.printf("%3s %3s %3s  ",a,b,c);
        if (isNumerical(a, b, c)){
            Integer x = Integer.valueOf(a);
            Integer y = Integer.valueOf(b);
            Integer z = Integer.valueOf(c);
            if (isDataUseful(x, y, z)){
                if (isTriangle(x, y, z)){
                    kindOfTriangle(x, y, z);
                }else
                    System.out.println("非三角形");
            }else {
                System.out.println("非三角形");
            }
        }else
            System.out.println("不可能");
    }
}
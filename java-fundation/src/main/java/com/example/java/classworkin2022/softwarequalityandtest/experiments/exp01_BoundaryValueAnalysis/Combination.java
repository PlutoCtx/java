package com.example.java.classworkin2022.softwarequalityandtest.experiments.exp01_BoundaryValueAnalysis;

/**
 * 输出指定数的组合数（其实就是个多重循环）
 *
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/10/26 19:01
 * @since JDK17
 */

public class Combination {
    public static void main(String[] args) {
        int[] arr01 = {1,2,99,100};        //for W-BVA
        int[] arr02 = {0,1,2,99,100,101};  //for W-BVA-R
        System.out.println("*******W-BVA******************");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4 ; j++){
//                for(int k = 0; k < 5 ; k++){
                    System.out.printf("%d,%d,50 \n",arr01[i],arr01[j]);
//                }
            }
        }


        System.out.println("*******W-BVA-R*****************");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6 ; j++){
//                for(int k = 0; k < 7 ; k++){
                    System.out.printf("%d,%d,50 \n",arr02[i],arr02[j]);
//                }
            }
        }

    }
}

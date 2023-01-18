package com.example.java.classworkin2022.documentationwriting.work04;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/11/14 22:56
 * @since JDK17
 */

public class Calculate {
    public double[] LocClass = new double[]{18,18,25,31,37,82,82,87,89,230,85,87,558};
    public double[] funNum = new double[]{3,3,3,3,3,5,4,4,4,10,3,3,10};
    public double[] Loc_fumNum = new double[]{6.0000,6.0000,8.3333,10.3333,12.3333,16.4000,20.5000,21.7500,22.2500,23.0000,28.3333,29.0000,55.8000};
    public double[] Lnxi = new double[]{1.7918, 1.7918, 2.1203, 2.3354, 2.5123, 2.7973, 3.0204, 3.0796, 3.1023, 3.1355, 3.3440, 3.3673, 4.0218};



    /**
     * 计算初始化方法
     * @return
     */
    public Calculate(double[] x, double[] y) {
        this.x = x;
        this.y = y;
        length = x.length;
        xAvg = getAverage(x);
        yAvg = getAverage(y);
    }

    /**
     * 计算平均值
     * @return
     */
    public double getAverage(double[] a) {
        double num = 0;
        for (int i = 0; i < length; i++) {
            num += a[i];
        }
        num = num / length;
        return num;
    }


    /**
     * 计算β1
     * @return
     */
    public double getVar() {
        double numerator = 0;
        double denominator = 0;

        for (int i = 0; i < length; i++) {
            numerator += x[i] * y[i];
        }
        numerator = numerator - length * xAvg * yAvg;

        for (int i=0;i<length;i++){
            denominator = denominator+ x[i]*x[i];
        }
        denominator = denominator - length * xAvg * xAvg;

        beta1 = numerator / denominator;
        return beta1;
    }






    public double[] x;
    public double[] y;
    public double length;
    public double xAvg;
    public double yAvg;
    public double beta1;
    public double beta0;
    public double r;
    public double yk;



    //取平均值，对多个数据取平均




    /**
     * 计算β1
     * @return
     */
    public double getBeita1() {
        double numerator = 0;//计算β1 的公式的分子部分
        double denominator = 0;//计算β1 的公式的分母部分

        for (int i = 0; i < length; i++) {
            numerator += x[i] * y[i];
        }
        numerator = numerator - length * xAvg * yAvg;

        for (int i=0;i<length;i++){
            denominator = denominator+ x[i]*x[i];
        }
        denominator = denominator - length * xAvg * xAvg;

        beta1 = numerator / denominator;
        return beta1;
    }


    /**
     * 计算β0
     * @return
     */
    public double getBeita0(double b1) {
        beta0 = yAvg - b1 * xAvg;
        return beta0;
    }


    /**
     * 计算yk
     * @return
     */
    public double getYk(double xk,double b0,double b1) {
        yk = b0 + b1 * xk;
        return yk;
    }


    /**
     * 计算r
     * @return
     */
    public double getR() {
        double numerator;//计算 r 参数的公式的分子部分
        double denominator;//计算 r 参数的公式的分母部分
        double xySum = 0;//xy 相乘的总和
        double xSum = 0;//x 的总和
        double ySum = 0;//y 的总和
        double xSquareSum = 0;//x^2 的总和
        double ySquareSum = 0;//y^2 的总和

        //计算 xy 的总和
        for (int i = 0; i < length; i++) {
            xySum += x[i] * y[i];
        }

        //计算 x 和 x^2 的总和
        for (double v : x) {
            xSum += v;
            xSquareSum += v * v;
        }

        //计算 y 和 y^2 的总和
        for (double v : y) {
            ySum += v;
            ySquareSum += v * v;
        }

        //计算公式分子部分
        numerator = length * xySum - xSum * ySum;

        //计算公式分母部分
        denominator = Math.sqrt((length * xSquareSum - xSum * xSum) *
                (length * ySquareSum - ySum * ySum));
        r = numerator / denominator;
        return r;
    }





}

package com.example.java.classworkin2022.documentationwriting.work03;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/11/14 9:31
 * @since JDK17
 */

public class Result {

    public double[] list01 = new double[]{130, 650, 99, 150, 128, 302, 95, 945, 368, 961};
    public double[] list02 = new double[]{163, 765, 141, 166, 137, 355, 136, 1206, 433, 1130};
    public double[] list03 = new double[]{186, 699, 132, 272, 291, 331, 199, 1890, 788, 1601};
    public double[] list04 = new double[]{15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2};
    public double beta0 = 0;
    public double beta1 = 0;
    public double r = 0;
    public double rSquare = 0;
    public double xk = 386;
    public double yk = 0;
    //实现测试
    public void test(double[] x, double[] y) {
        Calculate method = new Calculate(x, y);
        beta1 = method.getBeita1();
        beta0 = method.getBeita0(beta1);
        r = method.getR();
        rSquare = r * r;
        yk = method.getYk(xk,beta0,beta1);
        System.out.printf("β0:%.4f  β1:%.4f  r:%.4f  r^2:%.4f  yk:%.4f\n",
                beta0, beta1, r, rSquare, yk);
    }
    //执行
    public void testImpl() {
//测试 1
        System.out.println("测试 1 ************************************************");
        test(list01, list03);
//测试 2
        System.out.println("测试 2 ************************************************");
        test(list01, list04);
//测试 3
        System.out.println("测试 3 ************************************************");
        test(list02, list03);
//测试 4
        System.out.println("测试 4 ************************************************");
        test(list02, list04);
    }
}

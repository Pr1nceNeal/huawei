package com.huawei.page1_7;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 *
 * 输入一个正浮点数值, 输出该数值的近似整数值
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float v = sc.nextFloat();

//        int out = (int)v;
//
//        float diff = v - out;
//
//        if (diff * 10 >= 5) {
//            System.out.println(out + 1);
//        } else {
//            System.out.println(out);
//        }
        System.out.println(Math.round(v));

    }
}

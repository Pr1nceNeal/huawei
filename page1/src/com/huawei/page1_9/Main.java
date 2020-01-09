package com.huawei.page1_9;

import java.util.Scanner;

/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 *
 * 输入一个int型整数
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String str = input + " ";

        StringBuilder output = new StringBuilder("");

        for (int i = str.length() - 1; i >=0; i--) {

            if (!output.toString().contains(str.charAt(i) + "")) {
                output.append(str.charAt(i));
            }
        }
        System.out.println(output.toString().trim());

    }
}

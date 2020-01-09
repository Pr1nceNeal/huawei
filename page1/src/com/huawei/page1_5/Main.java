package com.huawei.page1_5;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 *
 * 输入一个十六进制的数值字符串。
 * 输出该数值的十进制字符串。
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine().toLowerCase();
            if(str.startsWith("0x")) {
                str = str.substring(2, str.length());
            }
            int i = Integer.parseInt(str, 16);
            System.out.println(i);
        }

    }
}

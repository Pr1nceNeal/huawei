package com.huawei.page1_4;

import java.util.Scanner;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * 输出到长度为8的新字符串数组
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        while (str1.length() % 8 != 0) {
            str1 = str1 + '0';
        }
        String str2 = sc.nextLine();
        while (str2.length() % 8 != 0) {
            str2 = str2 + '0';
        }

        String str = str1 + str2;

        char[] chars = str.toCharArray();

        for(int i = 0; i<= chars.length - 1; i++) {
            if (i == 0 || i % 8 != 0) {
                System.out.print(chars[i]);
            } else {
                System.out.println();
                System.out.print(chars[i]);
            }
        }

    }
}

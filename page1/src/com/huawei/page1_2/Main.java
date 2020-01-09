package com.huawei.page1_2;

import java.util.Scanner;

/**
 * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 * 输出输入字符串中含有该字符的个数。
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine().toLowerCase();

        Character character = scanner.nextLine().toLowerCase().charAt(0);

        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }

        System.out.println(count);
    }
}

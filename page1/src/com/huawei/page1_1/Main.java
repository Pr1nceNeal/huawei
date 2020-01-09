package com.huawei.page1_1;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 *
 * input: 一行字符串，非空，长度小于5000。
 * output: 整数N，最后一个单词的长度。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int count = 0;

        for(int i = string.length() - 1; i >= 0; i--) {
            if (string.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        System.out.println(count);

    }
}

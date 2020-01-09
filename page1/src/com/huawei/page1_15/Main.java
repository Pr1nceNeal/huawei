package com.huawei.page1_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String binaryStr = Integer.toBinaryString(input);

        int count = 0;

        for (int i = 0; i < binaryStr.length() ;i++) {
            if (binaryStr.charAt(i) == '1') {
                count++;
            }
        }

        System.out.println(count);

    }
}

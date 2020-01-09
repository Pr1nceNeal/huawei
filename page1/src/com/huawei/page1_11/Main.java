package com.huawei.page1_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String str = input + "";

        for(int i = str.length() -1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}

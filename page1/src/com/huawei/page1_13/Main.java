package com.huawei.page1_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(reverse(input));

    }

    public static String reverse(String sentence) {

        String[] array = sentence.split(" ");

        StringBuilder result = new StringBuilder(array[array.length - 1]);

        for(int i = array.length - 2; i >= 0; i--) {
            result.append(" ").append(array[i]);
        }

        return result.toString();
    }
}

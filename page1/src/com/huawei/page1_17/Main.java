package com.huawei.page1_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int m = 0;
            int n = 0;

            String input = sc.nextLine();

            String[] array = input.split(";");

            for (int i = 0; i < array.length; i++) {
                if (isValidStr(array[i])) {
                    int num = Integer.valueOf(array[i].substring(1, array[i].length()));
                    if (array[i].charAt(0) == 'A') {
                        m = m - num;
                    } else if (array[i].charAt(0) == 'D') {
                        m = m + num;
                    } else if (array[i].charAt(0) == 'W') {
                        n = n + num;
                    } else if (array[i].charAt(0) == 'S') {
                        n = n - num;
                    }
                }
            }

            System.out.println(m + "," + n);
        }


    }

    public static boolean isValidStr(String input) {
        if (!input.startsWith("A") &&
                !input.startsWith("W") &&
                !input.startsWith("D") &&
                !input.startsWith("S")) {
            return false;
        }

        for(int i = 1; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}

package com.huawei.page1_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int totalNul = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < totalNul; i++) {
            list.add(sc.nextLine());
        }

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }

    }
}

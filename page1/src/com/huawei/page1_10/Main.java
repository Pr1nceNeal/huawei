package com.huawei.page1_10;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。
 * 字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。
 *
 * 输入N个字符，字符在ACSII码范围内。
 * 输出范围在(0~127)字符的个数。
 */

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            char[] ch=str.toCharArray();
            HashSet<Character> set=new HashSet<>();
            for (char aCh : ch) {
                set.add(aCh);
            }
            System.out.println(set.size());
        }
        sc.close();
    }
}

package com.huawei.page1_8;

import java.util.*;

/**
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 *
 * 先输入键值对的个数,然后输入成对的index和value值，以空格隔开
 * 输出合并后的键值对（多行）
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalNum = sc.nextInt();
        int[][] array = new int[totalNum][2];

        for (int i = 0; i < totalNum; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        Set<Integer> set = new TreeSet<>();
        for(int i =0; i< totalNum; i ++) {
            set.add(array[i][0]);
        }

        for (Integer integer : set) {
            int sum = 0;
            for (int i = 0; i < totalNum; i++) {
                if (array[i][0] == integer) {
                    sum = sum + array[i][1];
                }
            }
            System.out.println(integer + " " + sum);
        }
    }
}

package com.huawei.page1_3;

import java.util.*;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，
 * 为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，
 * 不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
 * 按照排好的顺序去找同学做调查。
 * 请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 *
 Input Param
 n               输入随机数的个数
 inputArray      n个随机整数组成的数组


 Return Value
 OutputArray    输出处理后的随机整数

 输入多行，先输入随机整数的个数，再输入相应个数的整数
 返回多行，处理后的结果
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            int totalNum = scanner.nextInt();

            int[] array = new int[totalNum];

            int element;

            for(int i = 0; i < totalNum; i++) {
                element = scanner.nextInt();
                array[i] = element;
            }

            List<Integer> list = new ArrayList<>();
            for(Integer integer : array) {
                list.add(integer);
            }

            List<Integer> list2 = new ArrayList<>();
            for (Integer integer : list) {
                if(!list2.contains(integer)) {
                    list2.add(integer);
                }
            }

            Collections.sort(list2);

            for (Integer integer : list2) {
                System.out.println(integer);
            }
        }



    }
}

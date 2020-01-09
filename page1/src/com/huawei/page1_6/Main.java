package com.huawei.page1_6;

import java.util.Scanner;

/**
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 最后一个数后面也要有空格

 详细描述：

 函数接口说明：
 public String getResult(long inputLong)

 输入参数：
 long inputLong：输入的正整数

 返回值：
 String

 输入一个long型整数, 输出按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long inputLong = scanner.nextLong();
        System.out.println(getResult(inputLong));
    }

    public static String getResult(long inputLong){
        String str = "";

        for(long i = 2; i <= inputLong;i++) {
            if(inputLong % i == 0) {
                str = str + i + ' ';
                inputLong = inputLong / i;
                i=1;
            }
        }
        return str;
    }
}

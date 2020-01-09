package com.huawei.page1_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int N = in.nextInt();
            int m = in.nextInt();
            int[][] vm = new int[m+1][N+1];
            int[] v = new int[m+1];
            int[] vp = new int[m+1];
            int[] q = new int[m+1];
            for(int i = 1; i <= m; i++) {
                v[i] = in.nextInt(); //价格
                vp[i] = v[i] * in.nextInt(); //价值
                q[i] = in.nextInt(); //是否主件
            }
            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= N; j++) {
                    if(q[i] == 0) { //主件
                        if(v[i] <= j) {
                            vm[i][j] = Math.max(vm[i-1][j],vm[i-1][j-v[i]]+vp[i]);
                        }
                    }
                    else { //附件
                        if(v[i] + v[q[i-1]]<= j) {
                            vm[i][j] = Math.max(vm[i-1][j],vm[i-1][j-v[i]]+vp[i]);
                        }
                    }
                }
            }
            System.out.println(vm[m][N]);
        }

    }
}
package com.hjx.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrs = new int[n];
        for (int i=0;i<n;i++){
            arrs[i] = scanner.nextInt();
        }

        isHandle(arrs);
    }

    public static void isHandle(int[] arrs){
        int temp = Arrays.stream(arrs).max().getAsInt();
        boolean flag = true;
        for (int j=0;j<arrs.length;j++){
            int bz = arrs[j];
            while (bz<temp){
                bz += arrs[j];
            }
            if(bz != temp){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

package com.baekjoon.step1.q2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int bigger = arr[0];
        int order = 1;
        for(int i = 1; i < 9; i++) {
            if(bigger < arr[i]) {
                bigger = arr[i];
                order = i+1;
            } else {
                continue;
            }
        }

        System.out.println(bigger);
        System.out.println(order);
    }
}

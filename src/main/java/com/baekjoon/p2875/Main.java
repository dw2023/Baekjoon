package com.baekjoon.p2875;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");

        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);
        int K = Integer.parseInt(nums[2]);

        int count = 0;

        while (N + M >= K && N >= 0 && M >= 0) {
            N -= 2;
            M--;
            count++;
        }
        System.out.println(count - 1);
    }
}

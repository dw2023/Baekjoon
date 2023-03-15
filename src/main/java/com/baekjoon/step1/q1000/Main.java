package com.baekjoon.step1.q1000;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");

        int n1 = Integer.parseInt(nums[0]);
        int n2 = Integer.parseInt(nums[1]);

        System.out.println(n1 + n2);

        sc.close();
    }
}
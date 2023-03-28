package com.baekjoon.step1.q4796;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int l = 0;
        int p = 0;
        int v = 0;
        int count = 0; // 최대로 사용가능한 일수
        int i = 1; // Case 세기

        while (true) {
            st = new StringTokenizer(br.readLine());

            l = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            if (l == 0 || p == 0 || v == 0) {
                break;
            } else if (l < v % p) {
                count = l * (v / p + 1);
            } else {
                count = v / p * l + v % p;
            } // l이 v % p 보다 작을 때와 아닐 때로 나누기

            System.out.println("Case " + i + ": " + count);
            i++;
        }
        br.close();
    }
}

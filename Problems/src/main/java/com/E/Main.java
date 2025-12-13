package com.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(
                "C:\\Users\\Eric\\Documents\\PP\\Problem_Solutions\\Problems\\src\\main\\java\\com\\E\\input.txt"));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 물이 새는 곳의 개수
        int l = sc.nextInt(); // 테이프의 길이
        int[] leaks = new int[n + 1];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            leaks[i] = sc.nextInt(); // 물이 새는 곳
        }

        Arrays.sort(leaks);

        int idx = 1;

        while (idx <= n) {
            count++;
            double limit = leaks[idx] + l - 0.5;
            while (idx <= n && leaks[idx] <= limit) {
                idx++;
            }
        }

        System.out.println(count);
    }
}

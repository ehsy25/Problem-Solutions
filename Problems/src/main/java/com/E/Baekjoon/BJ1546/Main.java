package com.E.Baekjoon.BJ1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            double a = (double) arr[i] / max;
                a = a*100;
                arr[i] = a;
            sum += arr[i];
        }
        System.out.println(sum/n);
    }
}

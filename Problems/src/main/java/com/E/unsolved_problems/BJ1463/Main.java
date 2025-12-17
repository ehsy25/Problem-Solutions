package com.E.unsolved_problems.BJ1463;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 1) {
            if (n % 3 == 0) {
                n = n / 3;
                count++;
                System.out.println("n/3");
            } else if (n % 2 == 0 && (n - 1) % 3 != 0) {
                n = n / 2;
                count++;
                System.out.println("n/2");

            } else {
                n -= 1;
                count++;
                System.out.println("n-1");
            }
        }
        System.out.println(count);
    }
}
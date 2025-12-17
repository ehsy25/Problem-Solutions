package com.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream(
        // "C:\\Users\\Eric\\Documents\\PP\\Problem_Solutions\\Problems\\src\\main\\java\\com\\E\\input.txt"));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 1) {
            if (n % 3 == 0 ) {
                n = n / 3;
                count++;
                System.out.println("n/3");
            } else if (n % 2 == 0 && (n-1)%3 != 0) {
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

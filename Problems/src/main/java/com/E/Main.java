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

        //BJ2839 설탕 배달

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(n > 0) {
            if(n > 5){
                n /= 5;
                count++;
            }
            else {
                n /= 3;
                count++;
            }
        }

        System.out.println(count);
    }
}

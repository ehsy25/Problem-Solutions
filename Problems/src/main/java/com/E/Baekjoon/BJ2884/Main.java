package com.E.Baekjoon.BJ2884;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m >= 45){
            m -= 45;
        } else if (m < 45 && h == 0) {
            int temp = 45 - m;
            m = 60 - temp;
            h = 23;
        } else if(m < 45){
            int temp = 45 - m;
            m = 60 - temp;
            h--;
        }
    System.out.println(h + " " + m);
    }
}


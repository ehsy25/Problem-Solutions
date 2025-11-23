package com.E.Baekjoon.BJ4344;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //System.setIn(new FileInputStream("src\\main\\java\\com\\E\\Baekjoon\\BJ4344\\input.txt"));
        Scanner sc = new Scanner (System.in);
        int c = sc.nextInt();
        for(int i = 0; i < c; i++){
            int n = sc.nextInt(); //학생 수
            double sum = 0;
            double [] grades = new double[n];
            for(int j = 0; j < n; j++){
                grades[j] = sc.nextDouble();
                sum += grades[j];
            }
            sum = sum/n;

            double count = 0;
            for(double a : grades){
                if(a > sum){
                    count++;
                }
            }

            count =(count/n)*100;
            System.out.printf("%.3f%%\n", count);
        }
    }
}

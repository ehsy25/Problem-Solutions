package com.E.Baekjoon.BJ2309;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] input = new int[9];
        for(int i = 0; i < 9; i++){
            input[i] = sc.nextInt();
        }

        int sum = 0;
        Arrays.sort(input);

        boolean found = false;
        for(int i = 0; i < input.length; i++){
            sum+=input[i];
        }
        for(int i = 0; i < input.length && !found; i++){
            for(int j = i+1; j < input.length; j++){
                if(sum - input[j] - input[i] == 100){
                    input[j] = 0;
                    input[i] = 0;
                    found = true;
                    break;
                }
            }
        }
        for (int i : input) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
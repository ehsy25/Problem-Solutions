package com.E.swea_problems.problem1206;

import java.util.Scanner;
import java.io.File;

public class Solution {
    public static void main(String args[]) throws Exception {
        // Read input from the provided sample_input.txt file
        Scanner sc = new Scanner(new File("src\\main\\java\\com\\E\\problem1206\\sample_input.txt"));

        //빌딩 높이 받기
        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            int[] buildings = new int[n];
            for (int i = 0; i < n; i++) {
                int height = sc.nextInt();
                buildings[i] = height;
            }

            int count = 0;

            for (int i = 2; i < n - 2; i++) {
                int temp = 0;
                int left = Math.max(buildings[i - 1], buildings[i - 2]);
                int right = Math.max(buildings[i + 1], buildings[i + 2]);
                if(left >= right){
                    temp = left;
                } else temp = right;

                if(buildings[i] > temp){
                    count += buildings[i] - temp;
                }
            }
            System.out.println("#" + test_case + " " + count);
        }
    }
}
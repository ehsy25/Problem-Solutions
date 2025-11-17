package com.E.swea_problems.problem1209;

import java.util.Scanner;
import java.io.FileInputStream;


/*100* 100 array가 있을 때 각 행의 합, 열의 합, 그리고 양 대각선의 합 중 가장 큰 수를 프린트해라*/
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int T;
            T=sc.nextInt();
            // array initialize
            int[][] arr = new int [100][100];
            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int [] sums = new int [202];


            int idx = 0;
            int yidx = 100;
            for(int i = 0; i < 100; i++) {
                int sum = 0;
                int ysum = 0;
                for(int j = 0; j < 100; j++) {
                    sum += arr[i][j];
                    ysum += arr[j][i];
                }
                sums[idx++] = sum;
                sums[yidx++] = ysum;
            }

            int sum = 0;
            for(int i = 0; i < 100; i++) {
                sum += arr[i][i];
            }
            sums[idx++] = sum;
            sum = 0;
            for(int i = 99; i >= 0; i--) {
                sum += arr[i][99-i];
            }
            sums[idx++] = sum;
            int max = 0;
            for(int n : sums) {
                if(n > max) {
                    max = n;
                }
            }
            System.out.println("# "+ test_case + max);
        }
    }
}


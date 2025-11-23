package com.E.swea_problems.problem1966;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        //System.setIn(new FileInputStream("res/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }


            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++){
                sb.append(arr[i]+" ");
            }
            String result = sb.toString().trim();

            System.out.println("#" + test_case + " " + result);


        }
    }
}

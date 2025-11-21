package com.E.swea_problems.problem1983;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        System.setIn(new FileInputStream("src\\main\\java\\com\\E\\swea_problems\\problem1983\\input.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int n = sc.nextInt(); //학생 수
            int k = sc.nextInt(); //출력해야 할 학생 번호

            double [] scores = new double[n];
            double [] copy = new double[n];
            String [] grades = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

            for (int i = 0; i < n; i++) {
                int mid = sc.nextInt();
                int finalExam = sc.nextInt();
                int assignments = sc.nextInt();

                double total = (mid * 0.35) + (finalExam * 0.45) + (assignments * 0.2);

                scores[i] = total;
                copy[i] = total;
            }

            Arrays.sort(copy);

            int percentile = (n/10);
            int idx = 0;

//            if(percentile%2 == 0){
//                percentile-=1;
//            }

            for(int i=0;i<n;i++){
                if(scores[k-1] == copy[i]){
                    idx = i;
                }
            }

//            System.out.println("SCORES ORIGINAL = " + Arrays.toString(scores));
//            System.out.println("COPY " + Arrays.toString(copy));

            System.out.println("#" + test_case + " " + grades[idx/percentile]);
        }
    }
}

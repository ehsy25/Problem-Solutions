package com.E.swea_problems.problem1970;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        //System.setIn(new FileInputStream("src\\main\\java\\com\\E\\swea_problems\\problem1970\\input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int price = sc.nextInt();
            int[] n = {50000,10000,5000,1000,500,100, 50, 10};
            int [] counts = new int [n.length];

            int count = 0;
            while(price!=0 && count<n.length){
                if(price < n[count]){
                        count++;
                } else {
                    price -= n[count];
                    counts[count] += 1;
                }
            }

            System.out.println("#" + test_case);
            StringBuilder sb = new StringBuilder("");

            for(int i=0;i<counts.length;i++){
                sb.append(counts[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}

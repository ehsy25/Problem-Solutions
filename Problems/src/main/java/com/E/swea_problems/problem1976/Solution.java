package com.E.swea_problems.problem1976;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        System.setIn(new FileInputStream("src\\main\\java\\com\\E\\swea_problems\\problem1976\\input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int hour1 =  sc.nextInt();
            int min1 = sc.nextInt();
            int hour2 = sc.nextInt();
            int min2 = sc.nextInt();

            int totalHour = (hour1+hour2)%12;

            int totalMin = 0;
            if((min1+min2) > 60){
                totalMin = (min1+min2)%60;
                if(totalHour + 1 <= 12){
                    totalHour++;
                } else totalHour = 1;
            } else totalMin = (min1+min2);

            System.out.println("#"+test_case +" "+ totalHour+" "+totalMin);
        }
    }
}

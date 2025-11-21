package com.E.swea_problems.problem1979;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        System.setIn(new FileInputStream("src\\main\\java\\com\\E\\swea_problems\\problem1979\\input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int n =  sc.nextInt(); //사이즈
            int k =  sc.nextInt(); //글자 길이

            int [][] puzzle =  new int [n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    puzzle[i][j] = sc.nextInt();
                }
            }
            //퍼즐 생성
            int count = 0;
            int length = 0;



            /*1을 찾고 옆으로 몇 칸인지 세고, 아래로 몇 칸 인지 세기*/
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int dx = i;
                    int dy = j;
                    //1시작 지점 발견
                    if(puzzle[i][j] == 1){
                        while(puzzle[dx][dy] == 1){
                            if(dy < n && puzzle[i][dy+1] == 1){
                                length++;
                                dy++;
                            }
                        }
                    }
                }
            }

        }
    }
}

package com.E.swea_problems.problem1210;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("src\\main\\java\\com\\E\\swea_problems\\problem1210\\input.txt"));
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int T =  sc.nextInt();
            int[][] ladder = new int [100][100];
            int dx = 0;
            int dy = 0;
            //사다리 값 채우기
            for(int i = 0; i < 100; i++){
                for(int j = 0; j < 100; j++){
                    ladder[i][j] = sc.nextInt();
                }
            }

            int x =99;
            int y = 0;

            // 도착지는 늘 맨 아랫줄에 있으니 99행중에서 어떤 열에 있는지 찾기
            for(int i = 0; i < 100; i++){
                if(ladder[99][i] == 2){
                    y = i;
                    break;
                }
            }

            //왼쪽과 오른쪽을 확인하고 없으면 위로 올라가기
            //첫줄에 도착할때까지
            while(x != 0){
                ladder[x][y] = 0;
                    if (y > 0 && ladder[x][y-1]==1){
                        y -= 1;
                    } else if(y < 99 && ladder[x][y+1] == 1){
                        y += 1;
                    } else {
                        x -= 1;}
                }
            System.out.println("#" +T + " " + y);
        }
    }
}

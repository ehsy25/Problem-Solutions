package com.E.swea_problems.problem1211;

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

            //사다리 값 채우기
            for(int i = 0; i < 100; i++){
                for(int j = 0; j < 100; j++){
                    ladder[i][j] = sc.nextInt();
                }
            }
            int [] counts = new int [100];
            for(int i = 0; i < 100; i++){
                int dx = 0;
                int dy = i;
                int count = 0;
                if(ladder[dx][dy] == 0){
                    continue;
                }

                int prevDir = 0;  // 0:아래, 1:왼쪽, 2:오른쪽
                while(dx != 99){
                    if(dy > 0 && ladder[dx][dy-1] == 1 && prevDir != 2){  // 오른쪽에서 온 게 아니면
                        dy -= 1;
                        prevDir = 1;
                        count++;
                    } else if(dy < 99 && ladder[dx][dy+1] == 1 && prevDir != 1){  // 왼쪽에서 온 게 아니면
                        dy += 1;
                        prevDir = 2;
                        count++;
                    } else {
                        dx += 1;
                        prevDir = 0;
                        count++;
                    }
                }
                counts[i] = count;
            }
            int min = Integer.MAX_VALUE;
            int minidx = 0;
            for(int i = 0; i < 100; i++){
                if(counts[i] > 0 && counts[i] < min){
                    min = counts[i];
                    minidx = i;  // 최소 거리를 가진 출발점
                }
            }
            System.out.println("#" +T + " "+ minidx);
        }
    }
}

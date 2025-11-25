package com.E.Baekjoon.BJ11651;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src\\main\\java\\com\\E\\Baekjoon\\BJ11651\\input.txt"));

        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt(); //test case

        //이중 배열 설정
        int[][] cords = new int[t][2];
        for(int i=0;i<t;i++){
            cords[i][0] = sc.nextInt();
            cords[i][1] = sc.nextInt();
        }

        //특정 열을 기준으로 정렬
        //Arrays.sort(cords, (x, y) -> Integer.compare(x[1],y[1]));
        //
        Arrays.sort(cords, (a, b) ->
                a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]
        );

        for(int i=0;i<t;i++){
            System.out.println(cords[i][0]+" "+cords[i][1]);
        }
    }
}

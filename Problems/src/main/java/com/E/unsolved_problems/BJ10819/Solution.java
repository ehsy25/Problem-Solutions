package com.E.unsolved_problems.BJ10819;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    static int n;
    static int[] arr;        // 입력 배열
    static boolean[] visited; // 사용 여부
    static int[] perm;       // 현재 순열
    static int maxSum = 0;   // 최댓값

    public static void main(String[] args) throws FileNotFoundException {
         System.setIn(new FileInputStream(
         "C:\\Users\\Eric\\Documents\\PP\\Problem-Solutions\\Problems\\src\\main\\java\\com\\E\\input.txt"));

        //BJ10819
       // |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|

        Scanner sc = new Scanner(System.in);

        n =  sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        visited = new boolean[n];
        perm = new int[n];

       backtrack(0);

        System.out.println(maxSum);

    }

    static void backtrack(int depth) {
        // 1. 종료: N개 다 뽑으면
        if(depth == n) {
            int sum = calculate();  // 차이 합 계산
            maxSum = Math.max(maxSum, sum);
            return;
        }

        // 2. 모든 숫자 시도
        for(int i = 0; i < n; i++) {
            if(visited[i]) continue;

            visited[i] = true;
            perm[depth] = arr[i];
            backtrack(depth + 1);
            visited[i] = false;
        }
    }

    static int calculate() {
        int sum = 0;
        for(int i = 0; i < n - 1; i++) {
            sum += Math.abs(perm[i] - perm[i + 1]);
        }
        return sum;
    }
}
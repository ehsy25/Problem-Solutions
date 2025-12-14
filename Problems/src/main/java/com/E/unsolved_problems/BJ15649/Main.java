package com.E.unsolved_problems.BJ15649;

import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int [] ns;
    static boolean [] v;
    static int[] recursiveN;
    public static void main(String[] args) {
// 백준 문제 n과m 다시 풀어보기

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ns = new int[n+1];
        v = new boolean[n+1];
        recursiveN = new int[n+1];

        for(int i = 0; i <= n; i++){
           ns[i] = i; 
        }
        
        //재귀 함수 다시 만들기
        re(0);

    }

    public static void re(int depth){
        if(depth == m){
            for(int i = 0; i < m; i++){
                System.out.print(recursiveN[i] + " ");
            }
            System.out.println();
            return;
        }


            for(int i = 1; i <= n; i++){
                if(v[i]) continue;

            v[i] = true;
            recursiveN[depth] = i;
            re(depth+1);
            v[i] = false;   
            }
}
}

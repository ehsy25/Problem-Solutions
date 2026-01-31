package com.E;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static long[] memo = new long[100];
    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream(
        //         "C:\\Users\\Eric\\Documents\\PP\\Problem-Solutions\\Problems\\src\\main\\java\\com\\E\\input.txt"));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = fibo(n);
            System.out.println(a);
    }

    private static long fibo(int n){              
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(memo[n] != 0){
            return memo[n];
        }
        
        memo[n] = fibo(n-1)+fibo(n-2);
                    return memo[n];

    }    
}
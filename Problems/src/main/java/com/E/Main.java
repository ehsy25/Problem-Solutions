package com.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(
                "C:\\Users\\Eric\\Documents\\PP\\Problem-Solutions\\Problems\\src\\main\\java\\com\\E\\input.txt"));

        //BJ10829

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        String proto = "";
        while(n != 0){
           if(n/2==0){
               n = n/2;
               proto += 1;
           }
           else {
               n = n % 2;
               proto += 1;
           }
        }

    }
}
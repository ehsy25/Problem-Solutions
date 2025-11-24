package com.E.Baekjoon.BJ9012;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main{

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src\\main\\java\\com\\E\\Baekjoon\\BJ9012\\input.txt"));

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            Stack<Character> check = new Stack<>();
            String str = sc.nextLine();
            char [] s = new char[str.length()];
            String result = "YES";
            for(int j=0;j<str.length();j++){
                s[j] = str.charAt(j);
            }

            for (char c : s) {
                if (c == '(') {
                    check.push('(');
                } else if (c == ')') {
                    if(check.isEmpty()){
                        result = "NO";
                        break;
                    }
                    check.pop();
                }
            }

            if(!check.isEmpty()){
                result = "NO";
            }
            System.out.println(result);
        }
    }
}


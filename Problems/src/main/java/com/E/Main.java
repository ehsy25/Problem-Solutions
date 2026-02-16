package com.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("C:\\Users\\Eric\\Documents\\PP\\Problem_Solutions\\Problems\\src\\main\\java\\com\\E\\input.txt"));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] a =  new int[n][m];
        int [][] b = new int[n][m];
        int [] [] c = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j] = a[i][j] +  b[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(c[i][j] + " ");
            }
        }

    }

}
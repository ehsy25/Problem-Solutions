package com.E.swea_problems.problem1974;

import java.util.HashSet;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Set;



/*================나중에 다시 풀어보기 =======================*/
class Solution
{
    public static void main(String args[]) throws Exception
    {

        System.setIn(new FileInputStream("src\\main\\java\\com\\E\\swea_problems\\problem1976\\input.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int[][] sudoku = new int[9][9];
            for (int i=0; i<9; i++){
                for (int j=0; j<9; j++){
                    sudoku[i][j]=sc.nextInt();
                }
            }
//sudoku setting

            Set<Integer> duplicates = new HashSet<>();
            Set<Integer> duplicates2 = new HashSet<>();

int result = 0;

boolean repeat = false;
//상하좌우 체크
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    duplicates.add(sudoku[i][j]);
                    duplicates2.add(sudoku[j][i]);
                }
                if(duplicates.size()!= 9 || duplicates2.size()!= 9){
                    repeat = true;
                }
                duplicates.clear();
                duplicates2.clear();
            }



            duplicates.clear();
            for(int i=0; i<9; i+=3){
                for(int j=0; j<9; j+=3){
                    duplicates.clear();
                    duplicates.add(sudoku[i][j]);
                    duplicates.add(sudoku[i][j+1]);
                    duplicates.add(sudoku[i][j+2]);
                    duplicates.add(sudoku[i+1][j]);
                    duplicates.add(sudoku[i+1][j+1]);
                    duplicates.add(sudoku[i+1][j+2]);
                    duplicates.add(sudoku[i+2][j]);
                    duplicates.add(sudoku[i+2][j+1]);
                    duplicates.add(sudoku[i+2][j+2]);
                }
                if(duplicates.size()!= 9){
                    repeat = true;
                }
            }
            if(repeat){
                result = 0;
            }else result = 1;

            System.out.println("#" + test_case + " " + result);
        }
    }
}

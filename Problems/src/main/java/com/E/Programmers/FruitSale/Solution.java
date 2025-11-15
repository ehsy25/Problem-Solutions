package com.E.Programmers.FruitSale;

import java.util.Arrays;
import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        sol.solution(k, m, score);
    }
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        int start = 0;
        int end = score.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = score[start];
            score[start] = score[end];
            score[end] = temp;

            // Move pointers inwards
            start++;
            end--;
        }

Stack<String> stack = new Stack<>();

        int[] box = new int[m];
        //k = price;
        //m = box size;

            for(int i = 0; i + m <= score.length; i+=m){
                int count = 0;
                while(count < m){
                    box[count] = score[i+count];
                    count++;
                }
            }
            int min = m+1;
            for(int n : box){
                if (n < min){
                    min = n;
                }
            }
            answer += min * m;
        System.out.println("sorted array " + Arrays.toString(score));
        System.out.println("answer " + answer);
        return answer;

    }

}
        
    


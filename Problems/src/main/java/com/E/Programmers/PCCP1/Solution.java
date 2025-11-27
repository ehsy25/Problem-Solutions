package com.E.Programmers.PCCP1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    /*두개의 배열이 주어진다
     * 첫 번째 배열은 각 버스들의 탑승 가능한 인원
     * 두 번째 배열은 각 정류장에 있는 승객의 수
     * 혼잡도는 버스 탑승 인원이 a, 정류장에 있는 승객의 수를 b라고 할때
     * b > a 라면 b-a를 혼잡도라고 한다
     * 혼잡도를 최소로 만드는 배치를 출력해라*/

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src\\main\\java\\com\\E\\Programmers\\PCCP1\\input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x = 1; x <= T; x++) {
            int n =  sc.nextInt();
            int[] buses =  new int[n];
            int [] stops = new int[n];

            for(int i = 0; i < n;i++){
                buses[i] = sc.nextInt();
            }
            for(int i = 0; i < n;i++){
                stops[i] = sc.nextInt();
            }

            Arrays.sort(buses);
            Arrays.sort(stops);

            reverse(buses);
            reverse(stops);

            int answer = 0;

            for(int i = 0; i < n; i++){
                if(buses[i] < stops[i]){
                    answer += stops[i]-buses[i];
                }
            }
            System.out.println("#" + x + " " + answer);
        }

    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}

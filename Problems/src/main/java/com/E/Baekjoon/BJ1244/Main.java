package com.E.Baekjoon.BJ1244;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lightNum = sc.nextInt();

        int [] lights =  new int[lightNum];
        for (int i = 0; i < lightNum; i++) {
            lights[i] = sc.nextInt();
        }
        int students =  sc.nextInt();
        sc.nextLine();
        String[] inputs  = new String[students];
        for(int i=0;i<students;i++){
            inputs[i] = sc.nextLine();
        }

        for(int i=0;i<students;i++){
            if(inputs[i].charAt(0) == 1){
                for(int j=0;j<lights.length;j++){
                    if(j % inputs[i].charAt(2) == 0){
                        if(lights[j] == 0){
                            lights[j] = 1;
                        }else lights[j] = 0;
                    }
                }
            }
            else {
                int middle = inputs[i].charAt(2);
                    int count = 0;
                    while(middle+count<lights.length && lights[middle-count] >= 0){
                        if(lights[middle+count] == lights[middle]-count){
                            if(lights[middle+count] == 0){
                                lights[middle+count] = 1;
                            }else lights[middle+count] = 0;
                            count++;
                        }
                    }
            }
        }

        0 0 1 1 0 0 1  1 0 0 0 0 0 0 1

        for(int i=0;i<lights.length;i++){
            if(i != lights.length-1){
                String s = lights[i]+"";
                System.out.print(s);
            } System.out.print(lights[i]);
        }
    }
}

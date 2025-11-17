package com.E.swea_problems.electric_car;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            //최대 이동 수
            int k = sc.nextInt();
            //종점
            int n = sc.nextInt();
            //충전기 갯수
            int m = sc.nextInt();

            int[] path = new int[n];
            int[] charge = new int[m];
            //array setting
            for(int i = 0; i < charge.length; i++) {
                charge[i] = sc.nextInt();
            }

            for(int i = 0; i < charge.length; i++) {
                int temp = 0;
                if(i == charge[temp]) {
                    path[i] = charge[temp++];
                }
            }

            Arrays.fill(charge, -1);
            int charged = 0;
            for(int i = 0; i < path.length; i++){
                int battery = k;
                int tcharged = 0;
                if(path[i] != -1) {
                    battery = k;
                    tcharged += 1;
                    charged = tcharged;
                }else battery -= 1;

                if(k == 0 && i != path.length-1) {
                    tcharged = 0;
                    charged = tcharged;
                }
            }


            System.out.println("#" + test_case + " " + charged);

        }

    }
}

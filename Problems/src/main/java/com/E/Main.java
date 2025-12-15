package com.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(
                "C:\\Users\\Eric\\Documents\\PP\\Problem_Solutions\\Problems\\src\\main\\java\\com\\E\\input.txt"));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] channels = new String[n];
        int pointer = 0;

        for (int i = 0; i < n; i++) {
            channels[i] = sc.nextLine();
        }
        while (channels[0] != "KBS1" || channels[1] != "KBS2") {
            if (channels[0] == "KBS1") {
            } else {
                while (channels[pointer] != "KBS1") {
                    System.out.print(1);
                    pointer++;
                }
            }
            while (channels[0] != "KBS1") {
                System.out.print(4);
                pointer--;
            }
            if (channels[1] == "KBS2") {
            } else {
                while (channels[pointer] != "KBS2") {
                    System.out.print(1);
                    pointer++;
                }
            }
            while (channels[0] != "KBS1") {
                System.out.print(4);
                pointer--;
            }
        }
    }
}

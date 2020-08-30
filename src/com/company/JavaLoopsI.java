package com.company;

import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
//        int N [] ={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

//        for(int k:N){
//            for (int j: N) {
//                System.out.println(k + " x " + j + " = " + k*j);
//            }
//        }

            Scanner in = new Scanner(System.in);
            int N = in.nextInt();

            for(int i = 1; i <= 10; i++){

                System.out.printf("%d x %d = %d%n", N, i, N*i);
            }

    }
}

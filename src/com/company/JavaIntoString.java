package com.company;

import java.util.Scanner;

public class JavaIntoString {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        boolean num=true;
        try {
            Integer i=Integer.parseInt(s);
        } catch(NumberFormatException nfe) {
            num=false;
        }
        if(num) {
            System.out.println("Good Job");
        } else System.out.println("Wrong answer");
        sc.close();
    }
}


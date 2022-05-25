package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact=1;
        for(;num>0;){
            fact = fact*num;
            num-=1;
        }
       System.out.println(fact);
    }
}

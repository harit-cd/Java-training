package com.company;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        System.out.println("Enter divident:");
        int div = sc.nextInt();
        int remain = num%div;
        int quot = num/div;
        System.out.println("Remainder =" + remain +"\nQuotinent = " + quot);
    }
}

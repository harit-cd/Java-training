package com.company;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        int avg =0;
        System.out.println("Enter numbers:");
        for(int i = 0; i<=4 ; i++){
            array[i] = sc.nextInt();
            avg+= array[i];
        }
        avg/=5;
        System.out.println(avg);

    }
}

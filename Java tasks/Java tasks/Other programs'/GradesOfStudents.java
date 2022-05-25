package com.company;

import java.util.Scanner;

public class GradesOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int total = 0;
        System.out.println("Enter marks for five subjects");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int avg = total / arr.length;
        System.out.println(avg);
        if (avg < 90) {
            if ((avg < 75)) {
                if (avg < 50) {
                    System.out.println("D");
                } else {
                    System.out.println("C");
                }
            } else {
                System.out.println("B");
            }

        } else
            System.out.println("A");
    }
}

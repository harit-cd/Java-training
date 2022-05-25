package com.company;

import java.util.Scanner;

public class StringAccending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();
        char arr[]  = text.toCharArray();
        char temp ;
        for(int i = 0; i<= text.length()-1;i ++){
            for(int j =0 ; j <= text.length()-1; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);
   }
}

package com.company;

import java.util.Scanner;

public class StringDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        String text = sc.nextLine();
        char[] temp = new char[text.length()];
        for(int i = 0 ;i<text.length();i++)
            temp[i] = text.charAt(i);
        Character[] arr = new Character[text.length()];
        for(int i =0 ; i <text.length(); i ++){
            arr[i] = text.charAt(i);
            for(int j = 0 ;j <text.length(); j++){
                if(arr[i].equals(temp[j])){
                    count++;
                    temp[j]='@';
                }
            }
            if(count >= 2)
                System.out.println(arr[i] + " Ocuurance: "+ count);
            count =0;
        }
    }
}

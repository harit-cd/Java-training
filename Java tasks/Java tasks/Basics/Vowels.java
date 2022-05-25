package com.company;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        switch(letter){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("Vowel");
                break;
            default:
                System.out.println("consonant");
        }

    }
}

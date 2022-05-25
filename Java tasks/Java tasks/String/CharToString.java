package com.company;

import java.util.Scanner;

public class CharToString{
    public void charToString(String sen){
        char letter1 = sen.charAt(0);
        System.out.println("String to char: " + letter1);
    }
    public void stringToChar(char letter){
        String sen1 = Character.toString(letter);
        System.out.println("Char to String: " + sen1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String sen = sc.nextLine();
        System.out.println("Enter Char:");
        char letter = sc.next().charAt(0);
        CharToString cs = new CharToString();
        cs.charToString(sen);
        cs.stringToChar(letter);

    }
}

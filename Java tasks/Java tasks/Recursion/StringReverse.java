package com.company;

import java.util.Scanner;
class Recursion{
    public static void display(String text) {
        if (text == null || text.length() <= 1)
            System.out.println(text);
        else {
            System.out.print(text.charAt(text.length() - 1));
            display(text.substring(0, text.length() - 1));
        }
    }
}

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Recursion.display(text);
    }
}

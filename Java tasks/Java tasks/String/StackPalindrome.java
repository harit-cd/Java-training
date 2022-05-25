package com.company;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> sta = new Stack<>();
        Stack<Character> stk = new Stack<>();
        System.out.println("Enter String: ");
        String text = sc.nextLine();
        String newText = "";
        for(int i =text.length()-1; i>=0 ; i--){
            sta.push(text.charAt(i));
        }
        Iterator itr = sta.iterator();
        while(itr.hasNext()){
            newText = newText+itr.next();
        }
        System.out.println(newText);
        if(text.equalsIgnoreCase(newText))
            System.out.println("It's a palindrome");
        else
            System.out.println("It's not a palindrome");
    }
}

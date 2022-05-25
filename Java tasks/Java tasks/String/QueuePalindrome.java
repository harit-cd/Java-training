package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueuePalindrome {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Queue<Character> queue = new LinkedList<>();
            System.out.println("Enter String: ");
            String text = sc.nextLine();
            String newText = "";
            for(int i =text.length()-1; i>=0 ; i--){
                queue.add(text.charAt(i));
            }
            Iterator itr = queue.iterator();
            while(itr.hasNext()){
                newText = newText+itr.next();
            }
            if(newText.equalsIgnoreCase(text))
                System.out.println("It's a palindrome");
            else
                System.out.println("It's not a palindrome");
        }
}



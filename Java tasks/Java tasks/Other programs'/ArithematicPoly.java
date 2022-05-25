package com.company;

import java.util.Scanner;

class Overload{
    public void calculation(int num1, int num2, char add){
        num1+=num2;
        System.out.println(num1);
    }
    public void calculation(int num1 , int num2,int sub){
        num1-=num2;
        System.out.println(num1);
    }
}

public class ArithematicPoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 100;
        int num2 = 25;
        char add = '+';
        char sub = '-';
        Overload over = new Overload();
        System.out.println("Enter operation");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+':
                over.calculation(num1,num2,add);
                break;
            case '-':
                over.calculation(num1,num2,sub);
                break;

        }
    }
}

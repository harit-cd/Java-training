package com.company;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 100;
        int num2 = 20;
        int sum = num1+num2;
        int sub = num1-num2;
        int mod = num1%num2;
        int div = num1/num2;
        int multi = num1*num2;
        System.out.println("Enter operation:");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+':
                System.out.println("The sum of numbers is "+ sum );
                break;
            case '-':
                System.out.println("The differance between the numbers is" + sub);
                break;
            case '*':
                System.out.println("The multiplication value is " + multi);
                break;
            case '/':
                System.out.println("The division value is " + div);
                break;
            case '%':
                System.out.println("The remainder value is " + mod );
                break;

        }


    }
}

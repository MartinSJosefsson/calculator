package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("My calculator app");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("Choose operation: ");
        //Scanner ...

    double num1 = 15, num2= 6, result = 0;
    char operator = '+';

    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;
        default:
            System.out.println(operator + " is not supported");
    }
        System.out.println(result);

    }


}
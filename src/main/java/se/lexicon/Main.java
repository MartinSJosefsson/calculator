package se.lexicon;

public class Main {
    public static void main(String[] args) {
        System.out.println("My calculator app");

    double num1 = 5, num2= 7, result = 0;
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
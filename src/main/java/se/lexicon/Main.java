package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        calculator calculator = new calculator();
        String input = "";

        while (true) {
            System.out.println("Welcome to my calculator app");
            System.out.println("Enter first value: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter calculation method (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter second value: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;


            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    try {
                        result = calculator.divide(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use one of the following: +, -, *, /");
                    validOperation = false;
                    break;
            }

            input = scanner.nextLine();

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.println("Do you want to continue? (y/n): ");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("n")) {
                System.out.println("Thank you for trying my calculator!");
                break;


        }


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


    }

}}
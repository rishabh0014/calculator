package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2,result;

        do {
            System.out.println("Basic Calculator using DevOps.");
            System.out.println("Choose operation : ");
            System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n" +
                    "5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // Addition
                    System.out.print("Enter the first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    number2 = scanner.nextDouble();
                    result = calculator.add(number1, number2);
                    System.out.println("Addition of " + number1 + " and " + number2 + " is: " + result);
                    System.out.println("\n");
                    break;

                case 2:
                    // Subtraction
                    System.out.print("Enter the first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    number2 = scanner.nextDouble();
                    result = calculator.subtract(number1, number2);
                    System.out.println("Subtraction of " + number1 + " and " + number2 + " is: " + result);
                    System.out.println("\n");
                    break;

                case 3:
                    // Multiplication
                    System.out.print("Enter the first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    number2 = scanner.nextDouble();
                    result = calculator.multiply(number1, number2);
                    System.out.println("Multiplication of " + number1 + " and " + number2 + " is: " + result);
                    System.out.println("\n");
                    break;

                case 4:
                    // Division
                    System.out.print("Enter the first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    number2 = scanner.nextDouble();
                    result = calculator.divide(number1, number2);
                    System.out.println("Division of " + number1 + " and " + number2 + " is: " + result);
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("Exiting....");
                    return;

                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
                    System.out.println("\n");
            }
        } while (true);
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        // Handle division by zero
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

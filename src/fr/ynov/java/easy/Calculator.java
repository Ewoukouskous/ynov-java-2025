package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("-=-=-=-=-=-=-=-=-=-");

        System.out.print("Which operator you want to perform? ");
        System.out.print("\n");
        System.out.println("1. addition\n2. subtraction\n3. multiplication\n4. division");
        int operation = input.nextInt();

        int result = 0;

        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-");

        System.out.println("The result is: " + result);

    }

}

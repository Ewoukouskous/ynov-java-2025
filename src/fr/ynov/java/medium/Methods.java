package fr.ynov.java.medium;

import java.util.Scanner;

public class Methods {

    static class Square {

        int number;

        public Square(int input) {
            this.number = input;
        }

        public static int square(int input) {
            return input * input;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int result = Square.square(number);
        System.out.println("Your number² is equal to : " + result);
    }

}

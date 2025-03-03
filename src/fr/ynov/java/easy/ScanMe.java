package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name =  input.nextLine();

        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello "  + name + ". You have " + age + " years old.");
    }

}

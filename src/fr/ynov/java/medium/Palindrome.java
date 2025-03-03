package fr.ynov.java.medium;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = sc.nextLine();

        String palindrome = new StringBuilder(word).reverse().toString();

        if (palindrome.equals(word)) {
            System.out.println("Your word is a palindrome");
        } else {
            System.out.println("Your word is not a palindrome");
        }

    }

}

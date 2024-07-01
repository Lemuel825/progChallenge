package Folder;

import java.util.Scanner;

public class Task9StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("Length of the string: " + length);

        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        String lowercase = input.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        char firstChar = input.charAt(0);
        System.out.println("First character: " + firstChar);

        char lastChar = input.charAt(length - 1);
        System.out.println("Last character: " + lastChar);

        String substring = input.substring(1, 5);
        System.out.println("Substring from 2nd to 5th character: " + substring);

    }
}

package Folder;

import java.util.Scanner;

public class Task12CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.trim();

        if (input.isEmpty()) {
            System.out.println("Input is empty.");
        } else {
            String[] words = input.split("\\s+");
            int wordCount = words.length;
            System.out.println("Word count: " + wordCount);
        }
    }
}

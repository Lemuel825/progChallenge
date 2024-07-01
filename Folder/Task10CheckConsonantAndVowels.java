package Folder;

import java.util.Scanner;
public class Task10CheckConsonantAndVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        int vowels = 0, consonants = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
//            else if (!Character.isWhitespace(ch) && !Character.isDigit(ch) && ch != '?' && ch != '&' && ch != '*') {
//                System.out.println("Ignoring symbol: " + ch);
//            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}

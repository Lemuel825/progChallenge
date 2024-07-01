package Folder;

import java.util.Scanner;

public class Task11Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        String result = input.equalsIgnoreCase(reversed) ? "Palindrome" : "Not a palindrome";

        System.out.println(result);
    }
}

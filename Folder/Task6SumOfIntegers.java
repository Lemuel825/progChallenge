package Folder;

import java.util.Scanner;

public class Task6SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getValidNumber(scanner, "Enter the first number: ");
        int num2 = getValidNumber(scanner, "Enter the second number: ");
        int num3 = getValidNumber(scanner, "Enter the third number: ");

        int sum = num1 + num2 + num3;
        System.out.print("The sum of the numbers is: " + sum);
    }

    private static int getValidNumber(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! \nPlease enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}

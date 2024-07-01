package Folder;

import java.util.Scanner;

public class Task4LargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = checkValidNumber(scanner, "Enter the first number:");
        int num2 = checkValidNumber(scanner, "Enter the second number:");
        int num3 = checkValidNumber(scanner, "Enter the third number:");

        if (num1 == num2 && num2 == num3) {
            System.out.println("\nAll numbers are equal");
        } else {
            int largest = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);
            System.out.println("\nThe Inputted Numbers are: " + num1 + ", " + num2 +", "+ num3);

            System.out.println("\nThe largest number is: " + largest);
        }
    }

    private static int checkValidNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! \nPlease enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}

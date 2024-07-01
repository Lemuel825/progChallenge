package Folder;

import java.util.Scanner;

public class Task14SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate average
        double average = n > 0 ? (double) sum / n : 0;

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

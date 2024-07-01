package Folder;

import java.util.Scanner;

public class Task3DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            String dayOfWeek = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" :
                            (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday" :
                            (day == 7) ? "Sunday" : "Invalid input";
            System.out.println("\n" +dayOfWeek);
        } else {
            System.out.println("Invalid input");
        }
    }
}

package Folder;

import java.util.Scanner;

public class Task2DaysOfMonth {
    static String [] monthName  =  {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};
    public static void main(String[] args) {
        Task2DaysOfMonth thisClass = new Task2DaysOfMonth();
        Scanner scanner = new Scanner(System.in);
        int days,month;


        month = checkValidNumber(scanner, "Enter  number:");

        System.out.println(thisClass.toString());
    }



    private static int checkValidNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! \nPlease enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    @Override
    public String toString() {
        return "{" +
                "[1] " + monthName[0] +
                "[2] " + monthName[1] + '\'' +
                "[3] " + monthName[2] + '\'' +
                "[4] " + monthName[3] + '\'' +
                "[5] " + monthName[4] + '\'' +
                "[6] " + monthName[5] + '\'' +
                "[7] " + monthName[6] + '\'' +
                "[8] " + monthName[7] + '\'' +
                "[9] " + monthName[8] + '\'' +
                "[10] " + monthName[9] + '\'' +
                "[11] " + monthName[10] + '\'' +
                "[12] " + monthName[11] + '\'' +
                '}';
    }
}

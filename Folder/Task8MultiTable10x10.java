package Folder;

public class Task8MultiTable10x10 {
    public static void main(String[] args) {
        int size = 10; // Size of the multiplication table

        // Print the table
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

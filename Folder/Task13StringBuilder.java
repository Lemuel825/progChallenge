package Folder;

import java.util.Scanner;

public class Task13StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();

        if (input.length() < 10) {
            System.out.println("String length should be at least 10 characters.");
            return;
        }

        StringBuilder sb = new StringBuilder(input);

        // 1. Print the length of the string.
        System.out.println("Length of the string: " + sb.length());

        // 2. Print the first character of the string.
        System.out.println("First character: " + sb.charAt(0));

        // 3. Print the last character of the string.
        System.out.println("Last character: " + sb.charAt(sb.length() - 1));

        // 4. Print the index of the first occurrence of 'a' in the string.
        int indexOfA = sb.indexOf("a");
        System.out.println("Index of 'a': " + indexOfA);

        // 5. Print the substring from index 3 to index 6.
        String substring = sb.substring(3, 7); // index 7 is exclusive
        System.out.println("Substring from index 3 to 6: " + substring);

        // 6. Append "123" to the end of the string.
        sb.append("123");
        System.out.println("String after appending '123': " + sb.toString());

        // 7. Insert "xyz" at index 4.
        sb.insert(4, "xyz");
        System.out.println("String after inserting 'xyz' at index 4: " + sb.toString());

        // 8. Delete the substring from index 2 to index 4.
        sb.delete(2, 5); // index 5 is exclusive
        System.out.println("String after deleting substring from index 2 to 4: " + sb.toString());

        // 9. Delete the character at index 8.
        sb.deleteCharAt(8);
        System.out.println("String after deleting character at index 8: " + sb.toString());

        // 10. Reverse the string and print it.
        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());
    }
}

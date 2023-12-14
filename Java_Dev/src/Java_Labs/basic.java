package Java_Labs;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        // Detect the data type and print the result
        detectAndPrintType(userInput);

        // Close the scanner
        scanner.close();
    }

    private static void detectAndPrintType(String input) {
        try {
            int intValue = Integer.parseInt(input);
            System.out.println("Data type: Integer");
        } catch (NumberFormatException e1) {
            try {
                double doubleValue = Double.parseDouble(input);
                System.out.println("Data type: Double");
            } catch (NumberFormatException e2) {
                // If not an integer or double, consider it as a String
                System.out.println("Data type: String");
            }
        }
    }
}

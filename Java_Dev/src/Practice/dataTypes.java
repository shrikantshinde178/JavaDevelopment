package Practice;

import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get various data inputs from the user
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Print the data types of the entered values
        System.out.println("Data types:");
        System.out.println("Integer: " + intValue + " - " + getType(intValue));
        System.out.println("Double: " + doubleValue + " - " + getType(doubleValue));
        System.out.println("String: " + stringValue + " - " + getType(stringValue));

        // Close the scanner
        scanner.close();
    }

    // Method to get the data type of a variable
    private static String getType(Object value) {
        return value.getClass().getSimpleName();
    }
}

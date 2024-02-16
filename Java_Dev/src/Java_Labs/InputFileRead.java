// Write a Java program that reads data from a text file containing integers Implement exception handling to deal with the following scenarios:
// Scenario 1.
//   If the file is not found, catch the exception and print a user-friendly error message
// Scenano 2.
//   If there is a non-integer value in the file, catch the exception and skip that particular value, continuing with the next one.

//solution:
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputRead {
    public static void main(String[] args) {
        try {
            // Attempt to read integers from the file "input.txt"
            readIntegersFromFile("input.txt");
        } catch (FileNotFoundException e) {
            // Catch FileNotFoundException if the file is not found
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Method to read integers from a file
    public static void readIntegersFromFile(String filename) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                try {
                    // Attempt to parse each line as an integer
                    int number = Integer.parseInt(line.trim());
                    // Print the integer if successful
                    System.out.println("Read integer: " + number);
                } catch (NumberFormatException e) {
                    // Catch NumberFormatException if the line is not an integer
                    System.out.println("Skipping non-integer value: " + line);
                }
            }
        } catch (IOException e) {
            // Catch IOException (and its subclasses) while reading the file
            // Rethrow as FileNotFoundException with a more informative message
            throw new FileNotFoundException("Error reading file: " + e.getMessage());
        }
    }
}

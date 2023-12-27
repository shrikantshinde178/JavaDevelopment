//Question
//Write a program to enter marks of five subjects and calculate total marks and average.
//Each subject has a full mark of 100. Give grades based on average marks. 
//Grades should be Ex (>90%), A (>80%) , B(>60%) ,C (>=40%) and F(<40%). 
//Use the Scanner class to take inputs from the console.

package Practice;

import java.util.Scanner;

public class GradeCalculator {

 // Method to calculate total marks
 public static int calculateTotalMarks(int English, int Physics, int Mathematics, int Chemistry, int Computer_Science) {
     return English + Physics + Mathematics + Chemistry + Computer_Science;
 }

 // Method to calculate average marks
 public static double calculateAverage(int totalMarks) {
     return totalMarks / 5.0;
 }

 // Method to determine grade based on average marks
 public static String determineGrade(double average) {
     if (average > 90) {
         return "Ex";
     } else if (average > 80) {
         return "A";
     } else if (average > 60) {
         return "B";
     } else if (average >= 40) {
         return "C";
     } else {
         return "F";
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Getting user input for marks.
     System.out.println("Enter marks for five subjects (out of 100):");
     System.out.print("English: ");
     int English = scanner.nextInt();

     System.out.print("Physics: ");
     int Physics = scanner.nextInt();

     System.out.print("Mathematics: ");
     int Mathematics = scanner.nextInt();

     System.out.print("Chemistry: ");
     int Chemistry = scanner.nextInt();

     System.out.print("Computer Science: ");
     int Computer_Science = scanner.nextInt();

     // Calculate total marks and average
     int totalMarks = calculateTotalMarks(English, Physics, Mathematics, Chemistry, Computer_Science);
     double average = calculateAverage(totalMarks);

     // Determine grade based on average marks
     String grade = determineGrade(average);

     // Display the result
     System.out.println("\nTotal Marks: " + totalMarks);
     System.out.println("Average Marks: " + average);
     System.out.println("Grade: " + grade);

     // Close the scanner
     scanner.close();
 }
}

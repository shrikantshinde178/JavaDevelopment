// Question
// Write a Java program that uses a method to calculate the area of a rectangle andcompare them using Relational Operator Steps
// Create a class Rectangle. 
// The Rectangle class should have two attributes length and width of type int
// Create a constructor that accepts length and width as parameters. 
// Area should be calculated as length*area. 
// Instantiate two Rectangle classes with random values. 
// Compare the areas of the two rectangles using the Relational Operator.
// If the first one is bigger than the second one, print “Rectangle1 > Rectangle2”.
// If the first one is smaller print Rectangle1 < Rectangle2”. 
// Otherwise print “They are equal”

package Practice;

import java.util.Scanner;

public class RectangleExample {
    double width;
    double length;

    // Constructor
    public RectangleExample(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Area calculation method
    public double areaCalculate() {
        return length * width;
    }

    // Compare areas method
    public static void compareAreas(RectangleExample firstRectangle, RectangleExample secondRectangle) {
        double areaFirstRectangle = firstRectangle.areaCalculate();
        double areaSecondRectangle = secondRectangle.areaCalculate();

        // Conditions
        if (areaFirstRectangle > areaSecondRectangle) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (areaFirstRectangle < areaSecondRectangle) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first rectangle
        System.out.println("Enter the length of the first rectangle: ");
        double length1 = scanner.nextDouble();
        System.out.println("Enter the width of the first rectangle: ");
        double width1 = scanner.nextDouble();

        // Get user input for the second rectangle
        System.out.println("Enter the length of the second rectangle: ");
        double length2 = scanner.nextDouble();
        System.out.println("Enter the width of the second rectangle: ");
        double width2 = scanner.nextDouble();

        // Instantiate two Rectangle classes with user-defined values
        RectangleExample firstRectangle = new RectangleExample(length1, width1);
        RectangleExample secondRectangle = new RectangleExample(length2, width2);

        // Call the compareAreas method 
        compareAreas(firstRectangle, secondRectangle);

        scanner.close();
    }
}

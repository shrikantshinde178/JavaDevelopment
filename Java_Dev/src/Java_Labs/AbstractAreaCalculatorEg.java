/* Problem Statement :
Create an abstract class Shape with an abstract method calculateArea().
Implement two subclasses, Circle and Rectangle, which inherit from Shape and
provide their own implementations of calculateArea().
Write a program to calculate and print the areas of a circle and a rectangle. 
*/
package Java_Labs;

abstract class Shapes {
    // Abstract method
    public abstract void calculateArea();
}

class Circle extends Shapes {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea() for Circle
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

class RectanglE extends Shapes {
    private double width;
    private double height;

    // Constructor
    public RectanglE(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of calculateArea() for Rectangle
    @Override
    public void calculateArea() {
        double area = width * height;
        System.out.println("Area of the rectangle: " + area);
    }
}

public class AbstractAreaCalculatorEg {
    public static void main(String[] args) {
        // Instantiate objects
        Circle circle = new Circle(5.0);
        RectanglE rectangle = new RectanglE(3.0, 6.0);

        // Calculate and print areas
        circle.calculateArea();
        rectangle.calculateArea();
    }
}

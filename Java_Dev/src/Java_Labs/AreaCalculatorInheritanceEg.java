/* Question: 
● Write a Java program to create a class called Shape with a method called getArea(). 
● Create a subclass called Circle and create a constructor that takes the value of radius(int) as input parameter. 
● Override the getArea() method. 
● Create a class called square that takes an attribute length. 
  Create a constructor that takes length as input. 
● Override the getArea() method. 
● Create a subclass of Shape called Rectangle that takes width and height as input to the constructor. 
● Override the getArea() method to calculate the area of a rectangle. 
Instantiate and call getArea() method.
*/

package Java_Labs;

class Shape {
    // getArea method declare
    public void getArea() {
        System.out.println("Area is not defined for the generic shape.");
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

class Square extends Shape {
    // length attribute
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public void getArea() {
        int area = length * length;
        System.out.println("Area of the square: " + area);
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        int area = width * height;
        System.out.println("Area of the rectangle: " + area);
    }
}

public class AreaCalculatorInheritanceEg {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 6);

        circle.getArea();
        square.getArea();
        rectangle.getArea();
    }
}


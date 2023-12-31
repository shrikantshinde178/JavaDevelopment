package Java_Labs;

class Vehicle {
    // Attributes
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method
    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }
}

class Car extends Vehicle {
    // Constructor using super()
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override drive() method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends Vehicle {
    // Constructor using super()
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override drive() method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class VehicleInheritanceEg {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2023, 180);
        Bike bike = new Bike("Honda", "CBR", 2023, 200);

        // Print attributes
        System.out.println("Car: " + car.make + " " + car.model + " " + car.year + " " + car.maximumSpeed);
        System.out.println("Bike: " + bike.make + " " + bike.model + " " + bike.year + " " + bike.maximumSpeed);

        // Call drive() method
        car.drive();
        bike.drive();
    }
}

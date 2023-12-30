package Practice;

class VehicleEg {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor with all fields as parameters
    public VehicleEg(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Drive method
    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }
}

class Car extends VehicleEg {
    // Constructor for Car class, calling super() to invoke the constructor of the parent class (Vehicle)
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Overriding the drive() method for Car
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends VehicleEg {
    // Constructor for Bike class, calling super() to invoke the constructor of the parent class (Vehicle)
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Overriding the drive() method for Bike
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        // Instantiate Car and Bike objects
        Car myCar = new Car("Toyota", "Camry", 2022, 180);
        Bike myBike = new Bike("Honda", "CBR500R", 2021, 120);

        // Print attributes
        System.out.println("Car Attributes:");
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Maximum Speed: " + myCar.maximumSpeed);
        myCar.drive();  // Invoke drive() method for Car

        System.out.println("\nBike Attributes:");
        System.out.println("Make: " + myBike.make);
        System.out.println("Model: " + myBike.model);
        System.out.println("Year: " + myBike.year);
        System.out.println("Maximum Speed: " + myBike.maximumSpeed);
        myBike.drive();  // Invoke drive() method for Bike
    }
}

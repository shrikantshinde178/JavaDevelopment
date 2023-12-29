/* Create a base class called PolymorphismVehicleEg with the following methods: 
*	● void start(): This method should print "Vehicle started." 
*	Create two subclasses of Vehicle called Car and Motorcycle. 
*	Override the start() method in each subclass to provide a 
*	specific implementation: 
*	● Car: Print "Car started." 
*	● Motorcycle: Print "Motorcycle started." 
*	Create a class called Garage with a method named serviceVehicle(PolymorphismVehicleEg vehicle). 
*	Inside this method, call the start() method of the provided vehicle 
*	object and print "Vehicle serviced." 
*	In the Main class, create instances of Car and Motorcycle. 
*	Create an instance of the Garage class. 
*	Call the serviceVehicle() method of the Garage class with instances 
*	of both Car and Motorcycle. 
*/

package Practice;

class PolymorphismVehicleEg {
	//Instance method
    public void start() {
        System.out.println("Vehicle has started.");
    }
    //accessing parent properties in car 
    static class Car extends PolymorphismVehicleEg {
        @Override
		public void start() {
            System.out.println("Car started.");
        }
    }
  //accessing parent properties in Motorcycle
    static class Motorcycle extends PolymorphismVehicleEg {
        @Override
        public void start() {
            System.out.println("Motorcycle started.");
        }
    }

    public static class Garage {
        void serviceVehicle(PolymorphismVehicleEg vehicle) {
            vehicle.start();
            System.out.println("Vehicle serviced");
        }
    }

    public static void main(String[] args) {
        PolymorphismVehicleEg poly = new PolymorphismVehicleEg();
        Car c1 = new Car();
        Motorcycle m1 = new Motorcycle();
        Garage gar = new Garage();
        gar.serviceVehicle(c1);
        gar.serviceVehicle(m1);
    }
}



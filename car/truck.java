package car;
 class Truck extends Vehicle1 {

	    // Constructor to initialize the truck's name and price
	    public Truck(String name, double price) {
	        super(name, price);
	    }

	    // Implementation of rentVehicle method
	    @Override
	    public void rentvehicle1() {
	        System.out.println("Truck " + getName() + " has been rented at a price of $" + getPrice());
	    }

	    // Implementation of returnVehicle method
	    @Override
	    public void returnvehicle1() {
	        System.out.println("Truck " + getName() + " has been returned.");
	    }
	
//Main class
public class Main {
  public static void main(String[] args) {
      // Create a Car object
      Car car = new Car("Toyota Camry", 150.0);
      car.rentvehicle1(); // Rent the car
      car.returnvehicle1(); // Return the car

      System.out.println(); // For better readability

      // Create a Bike object
      Bike bike = new Bike("Yamaha R15", 50.0);
      bike.rentvehicle1(); // Rent the bike
      bike.returnvehicle1(); // Return the bike

      System.out.println(); // For better readability

      // Create a Truck object
      Truck truck = new Truck("Ford F-150", 200.0);
      truck.rentvehicle1(); // Rent the truck
      truck.returnvehicle1(); // Return the truck
  }
}
 }


package car;

class Car extends Vehicle1 {
    
    // Constructor to initialize the car's name and price
    public Car(String name, double price) {
        super(name, price);
    }

    // Implementation of rentVehicle method
    @Override
    public void rentvehicle1() {
        System.out.println("Car " + getName() + " has been rented at a price of " + getPrice());
    }

    // Implementation of returnVehicle method
    @Override
    public void returnvehicle1() {
        System.out.println("Car " + getName() + " has been returned.");
    }
}
class Bike extends Vehicle1 {
	  
	  // Constructor to initialize the bike's name and price
	  public Bike(String name, double price) {
	      super(name, price);
	  }

	  // Implementation of rentVehicle method
	  @Override
	  public void rentvehicle1() {
	      System.out.println("Bike " + getName() + " has been rented at a price of " + getPrice());
	  }

	  // Implementation of returnVehicle method
	  @Override
	  public void returnvehicle1() {
	      System.out.println("Bike " + getName() + " has been returned.");
	  }
	   
}
	 
package car;
import java.util.ArrayList;
import java.util.List;

// User class to manage rented vehicles
public class user {
    private String userName;
    private List[] rentedVehicles;

    // Constructor to initialize user's name
    public user(String userName) {
        this.userName = userName;
        this.rentedVehicles = new ArrayList(); // Initialize the rented vehicles list
    }

    // Method to rent a vehicle
    public void rentvehicle1(vehicle1 vehicle) {
        rentedVehicles.add(vehicle); // Add the vehicle to the rented list
        System.out.println(userName + " has rented the vehicle: " + vehicle.getName());
    }

    // Method to return a vehicle
    public void returnvehicle1(vehicle1 vehicle) {
        if (rentedVehicles.remove(vehicle)) { // Remove the vehicle from the rented list
            System.out.println(userName + " has returned the vehicle: " + vehicle.getName());
        } else {
            System.out.println("Vehicle " + vehicle.getName() + " not found in " + userName + "'s rented vehicles.");
        }
    }

    // Method to display all rented vehicles
    public void displayRentedVehicles() {
        if (rentedVehicles.isEmpty()) {
            System.out.println(userName + " has not rented any vehicles.");
        } else {
            System.out.println(userName + " has rented the following vehicles:");
            for (Vehicle vehicle : rentedVehicles) {
                System.out.println("- " + vehicle.getName() + " (Price: $" + vehicle.getPrice() + ")");
            }
        }
    }
}

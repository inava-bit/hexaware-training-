package car;

 abstract class Vehicle1{
	    // attribute
	    private String name;
	    private double price;

	    // Constructor to initialize the name and price
	    public Vehicle1(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    // Getter and Setter for 'name'
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for 'price'
	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	    	this.price=price;
	    	}
	    public abstract void returnvehicle1();
	    public abstract void rentvehicle1();
 }
 
	
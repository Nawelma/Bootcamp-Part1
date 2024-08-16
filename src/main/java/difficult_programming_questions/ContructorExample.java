package difficult_programming_questions;

public class ContructorExample {
	public class Car {
	    private String brand;
	    private String model;
	    private int year;

	    // Constructor
	    public Car(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    // Getter methods
	    public String getBrand() {
	        return brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void main(String[] args) {
	        // Create a Car object using the constructor
	        Car myCar = new Car("Toyota", "Camry", 2022);

	        // Access the object's attributes using getter methods
	        System.out.println("Brand: " + myCar.getBrand());
	        System.out.println("Model: " + myCar.getModel());
	        System.out.println("Year: " + myCar.getYear());
	    }
	}

}

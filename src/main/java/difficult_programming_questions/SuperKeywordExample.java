package difficult_programming_questions;

public class SuperKeywordExample {
	class Vehicle {
	    protected String brand;

	    public Vehicle(String brand) {
	        this.brand = brand;
	    }

	    public void displayBrand() {
	        System.out.println("Brand: " + brand);
	    }
	}

	class Car extends Vehicle {
	    private int year;

	    public Car(String brand, int year) {
	        super(brand); // Calling the superclass constructor using super
	        this.year = year;
	    }

	    public void displayDetails() {
	        super.displayBrand(); // Calling the superclass method using super
	        System.out.println("Year: " + year);
	    }
	}

	public class Main {
	    public void main(String[] args) {
	        Car car = new Car("Toyota", 2022);
	        car.displayDetails();
	    }
	}

}

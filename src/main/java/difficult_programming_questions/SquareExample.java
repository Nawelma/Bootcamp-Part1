package difficult_programming_questions;

public class SquareExample implements Shape{
	
	    private double length;
	    private double width;

	    public SquareExample(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double calculateArea() {
	        return length * width;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return 2 * (length + width);
	    }
	}



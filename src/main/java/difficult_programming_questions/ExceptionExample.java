package difficult_programming_questions;

public class ExceptionExample {
	
	    public static void main(String[] args) {
	        try {
	            int result = divide(10, 0);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }

	    public static int divide(int dividend, int divisor) {
	        return dividend / divisor;
	    }
	}


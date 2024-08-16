package difficult_programming_questions;

public class StaticExample {
	
	    public static int count = 0; // static variable

	    public static void incrementCount() { // static method
	        count++;
	    }

	    public static class NestedClass { // static nested class
	        public void displayCount() {
	            System.out.println("Count: " + count);
	        }
	    }

	    public static void main(String[] args) {
	        incrementCount();
	        incrementCount();

	        System.out.println("Count: " + count);

	        NestedClass nestedObj = new NestedClass();
	        nestedObj.displayCount();
	    }
	}



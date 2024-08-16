package difficult_programming_questions;

public class VolatileExample {
	
	    private volatile boolean flag = false;

	    public void setFlag(boolean value) {
	        flag = value;
	    }

	    public void printFlag() {
	        System.out.println("Flag value: " + flag);
	    }

	    public static void main(String[] args) {
	        VolatileExample example = new VolatileExample();

	        // Thread 1 - Updates the flag value
	        new Thread(() -> {
	            example.setFlag(true);
	        }).start();

	        // Thread 2 - Reads and prints the flag value
	        new Thread(() -> {
	            example.printFlag();
	        }).start();
	    }
	}



package difficult_programming_questions;

public class ThreadExample {
	
	    public static void main(String[] args) {
	        // Create a new thread using the Thread class
	        Thread thread = new Thread(new MyRunnable());

	        // Start the thread
	        thread.start();

	        // Perform some tasks in the main thread
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Main thread: " + i);
	        }
	    }

	    // Runnable implementation
	    static class MyRunnable implements Runnable {
	        @Override
	        public void run() {
	            // Perform some tasks in the new thread
	            for (int i = 0; i < 5; i++) {
	                System.out.println("New thread: " + i);
	            }
	        }
	    }
	}



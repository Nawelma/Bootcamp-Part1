package difficult_programming_questions;

public class LambdaExpressionExample {
/* A lambda expression in Java is an unsigned function wich is one of the expression that let 
 * you write an expressive . It can be a way to handle functionality as a method argument 
 * or code as a data. It is been introduced in Java 8 by using it with functional interfaces 
 * that have only one abstract method. 
 */
	
	    public static void main(String[] args) {
	        // Using lambda expression to implement a functional interface
	        Greeting greeting = () -> System.out.println("Hello, World!");

	        // Calling the method defined by the functional interface
	        greeting.sayHello();
	    }
	}

	// Functional interface with a single abstract method
	interface Greeting {
	    void sayHello();
	}

	
	
	
	


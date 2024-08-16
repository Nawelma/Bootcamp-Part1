package com.medium.programming.questions;

public class FactorialUsingRecursion {
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n * factorial (n-1);
		}
	}
		public static void main(String[] args) {
			int number = 3;
			int result = factorial(number);
			System.out.println("The factorial of" + number +"is " + result);
			
		}
		

	}



package com_easy_programming_language;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter the second number");
		double num2 = scanner.nextDouble();
		
		System.out.println("Enter the operator(+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		
		double result = 0.0;
		
		switch (operator)  {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
			default:
				System.out.println("Invalid operator!");
				return;	
		}
		System.out.println("Result: " + result);	
	}
}

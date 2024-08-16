package com_easy_programming_language;

import java.util.Scanner;

public class fahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature in fahrenheit");
		double fahrenheit = scanner.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("Temperature in Celsius: "+ celsius);
	}
}

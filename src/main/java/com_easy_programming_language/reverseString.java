package com_easy_programming_language;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();
		
		String reversed = "";
		
		for (int i = input.length() - 1; i>= 0; i--) {
			reversed += input.charAt(i);
		}
			System.out.println("Reversed string: " + reversed);
	}
	}

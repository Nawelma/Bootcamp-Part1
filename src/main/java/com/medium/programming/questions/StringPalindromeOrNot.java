package com.medium.programming.questions;

import java.util.Scanner;

public class StringPalindromeOrNot {

	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string");
			String input = scanner.nextLine();
			String reversed = "";
			
			for (int i = input.length() - 1;  i >=0; i--) {
				reversed +=input.charAt(i);
			}
			if (input.equalsIgnoreCase(reversed)) {
				System.out.println(input + " is a palidrome");
			} else {
				System.out.println(input + " is not a palidrome");
			}
		}
	}



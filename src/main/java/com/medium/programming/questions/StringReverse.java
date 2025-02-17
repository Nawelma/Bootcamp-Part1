package com.medium.programming.questions;

public class StringReverse {
	
	    public static String reverseString(String input) {
	        StringBuilder reversed = new StringBuilder();

	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	        }

	        return reversed.toString();
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        String reversedString = reverseString(input);

	        System.out.println("Original string: " + input);
	        System.out.println("Reversed string: " + reversedString);
	    }
	}



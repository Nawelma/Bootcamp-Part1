package com.medium.programming.questions;

public class NumberPalindromeOrNot {

	    public static boolean isPalindrome(int number) {
	        int originalNumber = number;
	        int reverse = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	            number /= 10;
	        }

	        return originalNumber == reverse;
	    }

	    public static void main(String[] args) {
	        int number = 178871;

	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	    }
	}

	
	
	
	
	
	


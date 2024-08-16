package com.medium.programming.questions;

import java.util.Arrays;

public class SecondHighestNum {

	    public static int findSecondHighest(int[] array) {
	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;

	        for (int number : array) {
	            if (number > highest) {
	                secondHighest = highest;
	                highest = number;
	            } else if (number > secondHighest && number != highest) {
	                secondHighest = number;
	            }
	        }

	        return secondHighest;
	    }

	    public static void main(String[] args) {
	        int[] numbers = { 20, 30, 15, 25, 40 };
	        int secondHighest = findSecondHighest(numbers);

	        System.out.println("Array: " + Arrays.toString(numbers));
	        System.out.println("Second highest number: " + secondHighest);
	    }
	}



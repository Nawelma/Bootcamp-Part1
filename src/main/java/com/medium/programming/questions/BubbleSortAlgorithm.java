package com.medium.programming.questions;

import java.util.Arrays;

public class BubbleSortAlgorithm {
	
	    public static void bubbleSort(int[] array) {
	        int n = array.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap elements
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = { 54, 24, 15, 22, 42, 9, 85 };
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        bubbleSort(numbers);

	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	    }
	}



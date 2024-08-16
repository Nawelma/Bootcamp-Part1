package com.medium.programming.questions;

import java.util.Arrays;

public class SelectionSortAlgorithm {
	
	    public static void selectionSort(int[] array) {
	        int n = array.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;

	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap elements
	            int temp = array[minIndex];
	            array[minIndex] = array[i];
	            array[i] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = { 76, 46, 35, 22, 32, 56, 79 };
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        selectionSort(numbers);

	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	    }
	}



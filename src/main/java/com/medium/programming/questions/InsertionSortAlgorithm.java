package com.medium.programming.questions;

import java.util.Arrays;

public class InsertionSortAlgorithm {
	
	    public static void insertionSort(int[] array) {
	        int n = array.length;

	        for (int i = 1; i < n; i++) {
	            int key = array[i];
	            int j = i - 1;

	            while (j >= 0 && array[j] > key) {
	                array[j + 1] = array[j];
	                j--;
	            }

	            array[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = { 77, 88, 33, 29, 59, 31, 95 };
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        insertionSort(numbers);

	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	    }
	}



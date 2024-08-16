package com.medium.programming.questions;

public class BinarySearchAlgorithm {
	
	    public static int binarySearch(int[] array, int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid;
	            } else if (array[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] numbers = { 11, 22, 33, 44, 55, 66, 77 };
	        int target = 44;

	        int index = binarySearch(numbers, target);

	        if (index != -1) {
	            System.out.println("Element " + target + " found at index " + index);
	        } else {
	            System.out.println("Element " + target + " not found in the array");
	        }
	    }
	}



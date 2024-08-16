package com.quicksortAlgorithm;

public class QuickSort {
	
	    public static void quickSort(Object[] array, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(array, low, high);
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(Object[] array, int low, int high) {
	        // Choose the rightmost element as the pivot
	        Object pivot = array[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            // Compare each element with the pivot
	            if (compare(array[j], pivot) <= 0) {
	                i++;
	                swap(array, i, j);
	            }
	        }

	        // Place the pivot in the correct position
	        swap(array, i + 1, high);

	        return i + 1;
	    }

	    private static void swap(Object[] array, int i, int j) {
	        Object temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	    private static int compare(Object obj1, Object obj2) {
	        // Custom comparison logic for your objects
	        // Modify this method according to your object's attributes

	        // For example, if you have an array of Strings, you can use:
	        // return ((String) obj1).compareTo((String) obj2);

	        // If you have an array of custom objects, you can use their attributes to compare:
	        // return ((CustomObject) obj1).getAttribute().compareTo(((CustomObject) obj2).getAttribute());

	        // You can also use a Comparator or Comparable interface for more complex comparisons

	        return 0;
	    }

	    public static void main(String[] args) {
	        // Create an array of objects
	        Object[] array = {5, 2, 8, 9, 1, 3};

	        // Sort the array using the quicksort algorithm
	        quickSort(array, 0, array.length - 1);

	        // Print the sorted array
	        for (Object element : array) {
	            System.out.print(element + " ");
	        }
	    }
	}



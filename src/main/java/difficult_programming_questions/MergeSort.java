package difficult_programming_questions;

import java.util.Arrays;

public class MergeSort {
	
	    public static void mergeSort(int[] array) {
	        if (array.length <= 1) {
	            return;
	        }

	        int mid = array.length / 2;
	        int[] left = new int[mid];
	        int[] right = new int[array.length - mid];

	        System.arraycopy(array, 0, left, 0, left.length);
	        System.arraycopy(array, mid, right, 0, right.length);

	        mergeSort(left);
	        mergeSort(right);
	        merge(left, right, array);
	    }

	    private static void merge(int[] left, int[] right, int[] result) {
	        int i = 0, j = 0, k = 0;

	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                result[k++] = left[i++];
	            } else {
	                result[k++] = right[j++];
	            }
	        }

	        while (i < left.length) {
	            result[k++] = left[i++];
	        }

	        while (j < right.length) {
	            result[k++] = right[j++];
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 2, 8, 9, 1, 3};

	        mergeSort(array);

	        System.out.println("Sorted Array: " + Arrays.toString(array));
	    }
	}



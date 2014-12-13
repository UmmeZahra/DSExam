package sorting;

import java.util.Arrays;

public class SortingAlgo {

	// variables prepared for MergeSoft
	static int recursed = 0;
	static int mLooped = 0;  
	static int [] retArray;
	
	//Selection Sort
	public int[] selectionSort(int [] list){
	
		int temp = 0;
		int swapped = 0;
		int looped = 0;
		
		int min = 0;
		
		for(int i = 0; i < list.length - 1; i++) {
			min = i;
			int j;
	        for(j = i + 1; j <list.length; j++) {
	        	looped++;
	        	if(list[j] < list[min] )
	        		min = j;
	        }
	        temp = list[min];
	        list[min] = list[i];
	        list[i] = temp;
	        swapped++;
		}
		
		System.out.println("Swapped " + swapped + " times in SelectionSort.");
		System.out.println("Looped " + looped + " times in SelectionSort.");
		
		return list;
	}
		
	//Insertion Sort
	public int [] insertionSort (int [] array){
		
		int temp = 0;
		int moved = 0;
		
		for ( int i = 1; i < array.length; i++) {
			temp = array[i];
			int n;
			for( n = i - 1; ( n >= 0 ) && ( array[n] > temp ); n--) {   // Smaller values are moving up
				array[n + 1] = array[n];	// move elements
				moved++;
			}
			array[n+1] = temp;    // Put the key in its proper location
	    }
		
		System.out.println("Looped and moved " + moved + " times in InsertionSort.");
		
		return array;
	}
	
	//Bubble Sort
	public int[] bubbleSort(int [] array){

		int temp = 0;
		int swapped = 0;
		int looped = 0;
		
		for ( int i = 0; i < array.length - 1; i++ ) {
			for ( int j = i + 1; j < array.length; j++ ) {
				looped++;
				if ( array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					swapped++;
				}
			}
		}
		
		System.out.println("Swapped " + swapped + " times in BubbleSort.");
		System.out.println("Looped " + looped + " times in BubbleSort.");
		
		return array;
	}
	
	//Merge Sort
	public int[] mergeSort(int [] array){
	
		retArray = Arrays.copyOf(array, array.length);
		subMergeSort(0, retArray.length - 1);
		
		System.out.println("Recursed " + recursed + " times in MergeSort.");
		System.out.println("Looped " + mLooped + " times in MergeSort.");
		
		return retArray;
	}
	
	private static void subMergeSort(int low, int high) {
		recursed++;
		
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			subMergeSort(low, middle);
			// Sort the right side of the array
			subMergeSort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}
	
	private static void merge(int low, int middle, int high) {
		
		int [] helper = new int[retArray.length];
		
		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = retArray[i];
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			mLooped++;
			if (helper[i] <= helper[j]) {
				retArray[k] = helper[i];
				i++;
			} else {
				retArray[k] = helper[j];
				j++;
			}
			k++;
		}
		
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			mLooped++;
			retArray[k] = helper[i];
			k++;
			i++;
		}
		
	}
}

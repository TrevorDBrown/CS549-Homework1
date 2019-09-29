/*
 * CS 549 - Homework 1
 * Trevor D. Brown
 * 
 * Developed for:
 * 		CS 549-001 (Fall 2019)
 * 		Instructor: Dr. Qi Li
 * 
 * Description:
 * 		This application is designed to show an example of a
 * 		recursive implementation of Insertion Sort
 * 
 */
public class Homework1 {

	public static void main(String[] args) {
		// Test Inputs
		int[] a = {5, 4, 3, 2, 1}; 				// Reversed sort
		//int[] a = {4, 5, 8, 1, 2};				// Partial sort
		//int[] a = {1, 2, 3, 4 ,5};				// Sorted
		//int[] a = {4, 3, 7, 5, 2, 9, 11, 16, 13}; 	// Randomized
				
		int p = a.length;
		
		System.out.print("Array Before InsertionSort: ");
		PrintArrayContent(a);
		
		// Sort Array with recursive implementation of InsertionSort
		InsertionSort(a, p);
		
		System.out.print("Array After InsertionSort: ");
		PrintArrayContent(a);
		
	}
	
	public static void InsertionSort(int[] a, int p) {
		
		// Base Case - p is at 0 (i.e. beginning of array)
		if (p < 2) {
			return;
		}
		
		// Call InsertionSort for subarray 1 ... p - 1
		InsertionSort(a, p - 1);
		
		int l = a[p - 1];	// Value at last position
		int i = p - 2;		// Index for looping
		
		// While index is greater than 0 and the current value at index is greater than value in l
		while (i >= 0 && a[i] > l) {
			a[i + 1] = a[i];	// Sort value at i in i + 1
			i--;
		}
		
		a[i+1] = l;		// Store the value in l at its proper position
		
		System.out.print("Array After Iteration of InsertionSort: ");
		PrintArrayContent(a);
	}
	
	public static void PrintArrayContent(int[] a) {
		System.out.print("[");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
			
			if (i + 1 < a.length) {
				System.out.print("|");
			}
			
		}
		
		System.out.print("]");
		System.out.println("");
	}

}

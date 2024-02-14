package com.kn.shiftingktimes;

public class ShiftingKTimes {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] brr = new int[arr.length];
		int k = 4;

		// Shift elements to the left by k positions
		System.arraycopy(arr, k, brr, 0, arr.length - k);
		System.arraycopy(arr, 0, brr, arr.length - k, k);
		// Display the original and shifted arrays
		System.out.println("Original Array: ");
		printArray(arr);

		System.out.println("\nShifted Array: ");
		printArray(brr);
	}

	private static void printArray(int[] brr) {
		for (int value : brr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}

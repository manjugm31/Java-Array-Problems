package com.kn.findinglargestandsmallest;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element at index " + i + ":");
			arr[i] = scan.nextInt();
		}

		// Find the largest and smallest elements using iteration
		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Smallest element (iteration): " + min);
		System.out.println("Largest element (iteration): " + max);

		// Using Arrays.sort to find smallest and largest
		Arrays.sort(arr);
		System.out.println("\nSmallest element (Arrays.sort): " + arr[0]);
		System.out.println("Largest element (Arrays.sort): " + arr[arr.length - 1]);

		// Using Bubble Sort to find smallest and largest
		bubbleSort(arr);
		System.out.println("\nSmallest element (Bubble Sort): " + arr[0]);
		System.out.println("Largest element (Bubble Sort): " + arr[arr.length - 1]);
	}

	// Bubble Sort implementation
	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}

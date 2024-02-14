package com.kn.containsspecificvalue;


import java.util.Arrays;
import java.util.Scanner;

public class  ContainsSpecificValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the value to search:");
        int targetValue = scanner.nextInt();

        System.out.println("Choose search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int linearSearchResult = linearSearch(arr, targetValue);
                displaySearchResult(linearSearchResult, targetValue);
                break;
            case 2:
                // Binary search requires a sorted array
                Arrays.sort(arr);
                int binarySearchResult = binarySearch(arr, targetValue);
                displaySearchResult(binarySearchResult, targetValue);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; // Element found, return its index
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void displaySearchResult(int result, int target) {
        if (result != -1) {
            System.out.println(target + " found at index: " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}

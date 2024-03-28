package com.kn.methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAndAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int numElements = scanner.nextInt();

        int[] array = new int[numElements];
        System.out.println("Enter the elements:");

        // Input elements into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Call the method to sort the array and add 5 to each element
        addAndPrint(array);
    }

    // Method to sort the array and add 5 to each element
    private static void addAndPrint(int[] array) {
        // Sort the array in ascending order
        Arrays.sort(array);

        // Add 5 to each element and print the modified array
        System.out.println("Sorted array with 5 added to each element:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + 5 + " ");
        }
    }
}

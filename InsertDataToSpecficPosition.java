package com.kn.insertdatatospecficvalue;

import java.util.Scanner;

public class InsertDataToSpecficPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter data to insert:");
        int data = scanner.nextInt();

        System.out.println("Enter position to insert:");
        int position = scanner.nextInt();

        if (position >= 0 && position <= arr.length) {
            int[] brr = new int[size + 1];

            // Copy elements before the insertion position
            System.arraycopy(arr, 0, brr, 0, position);

            // Insert the new data at the specified position
            brr[position] = data;

            // Copy elements after the insertion position
            System.arraycopy(arr, position, brr, position + 1, arr.length - position);

            System.out.println("Array after insertion:");
            for (int i = 0; i < brr.length; i++) {
                System.out.println(brr[i]);
            }
        } else {
            System.out.println("Invalid position. Position should be between 0 and " + arr.length);
        }

        scanner.close();
    }
}

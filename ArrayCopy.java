package com.kn.arraycopy;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = scan.nextInt();
        }

        // Manual array copying using a loop
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

        // Using System.arraycopy
        int[] crr = new int[arr.length];
        System.arraycopy(arr, 0, crr, 0, arr.length);

        // Using clone method
        int[] drr = arr.clone();

        System.out.println("Before copying:");
        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.println("\nAfter manual copying:");
        System.out.println("Copied array (manual): " + Arrays.toString(brr));

        System.out.println("\nAfter using System.arraycopy:");
        System.out.println("Copied array (System.arraycopy): " + Arrays.toString(crr));

        System.out.println("\nAfter using clone method:");
        System.out.println("Copied array (clone): " + Arrays.toString(drr));
    }
}

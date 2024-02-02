package com.kn.findingindexpostition;

import java.util.Scanner;

public class FindingIndexPosition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();

        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the element you want to find:");
        int target = scan.nextInt();

        int index = findIndex(arr, target);

        if (index != -1) {
            System.out.println("Element found at index position: " + index);
            System.out.println("Data is: " + target);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1; // Element not found
    }
}

package com.kn.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {23, 5435, 34, 5, 214};
        
        // Bubble sort algorithm
        bubbleSort(arr);
        
        // Print sorted array
        printArray(arr);
    }

    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        System.out.print("Sorted Array: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("}");
    }
}

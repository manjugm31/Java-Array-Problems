package com.kn.Insertionsort;

public class InsertionSortOne {

    public static void main(String[] args) {
        int[] arr = {3, 1, 32, 234, 123213, 12, 122};
        System.out.println("Before sorting:");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("\nAfter sorting:");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(" ");
        }
        System.out.print("}");
    }
}

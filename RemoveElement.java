package com.kn.removeelement;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int indexToRemove = 2;

        // Check if the index to remove is valid
        if (indexToRemove >= 0 && indexToRemove < a.length) {
            int[] c = removeElement(a, indexToRemove);

            // Print the updated array 'c'
            System.out.println("Array after removing element:");
            for (int element : c) {
                System.out.println(element);
            }
        } else {
            System.out.println("Invalid index to remove.");
        }
    }

    private static int[] removeElement(int[] array, int index) {
        // Create a new array with one less element
        int[] resultArray = new int[array.length - 1];

        // Copy elements before the index
        System.arraycopy(array, 0, resultArray, 0, index);

        // Copy elements after the index
        System.arraycopy(array, index + 1, resultArray, index, array.length - index - 1);

        return resultArray;
    }
}

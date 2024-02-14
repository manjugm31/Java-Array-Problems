package com.kn.mergingtwoarray;

public class MergingTwoArrays {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = new int[a.length + b.length];

        // Copy elements of array 'a' to 'c'
        System.arraycopy(a, 0, c, 0, a.length);

        // Copy elements of array 'b' to 'c' starting from the position after array 'a'
        System.arraycopy(b, 0, c, a.length, b.length);

        // Print the merged array 'c'
        System.out.println("Merged Array:");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}

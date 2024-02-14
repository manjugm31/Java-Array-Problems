package com.kn.reverseprinting;

public class ReversePrinting {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] a = {1, 2, 3, 4, 5, 6};

        // Print elements in the proper order
        System.out.println("Proper way");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Print elements in reverse order
        System.out.println("Reverse order");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}

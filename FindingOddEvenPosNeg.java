package com.kn.findingoddevenposneg;

import java.util.Scanner;

public class FindingOddEvenPosNeg {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        for (int i = 0; i < a.length; i++) {
            // Check if the index is even or odd
            if (i % 2 == 0) {
                System.out.println(i + " is even index");
            } else {
                System.out.println(i + " is odd index");
            }

            // Check if the element is positive, negative, or zero
            if (a[i] > 0) {
                System.out.println(a[i] + " is positive");
            } else if (a[i] < 0) {
                System.out.println(a[i] + " is negative");
            } else {
                System.out.println(a[i] + " is zero");
            }
        }
    }
}

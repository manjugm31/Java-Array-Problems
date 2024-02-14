
package com.kn.findingduplicate;

import java.util.Arrays;

public class Findingduplicate {

	 public static void main(String[] args) {
	        int a[] = { 1, 3, 5, 677, 8, 5, 5, 1, 5, 8, 9, 6, 5 };
	        Arrays.sort(a); // Sort the array
	        times(a);//(1,1,3,5,5,5,5,5,6,8,8,9,677)
	    }

	    static void times(int[] a) {
	        int count = 1; // Start count from 1
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] == a[i - 1]) {
	                count++; // Increment count if current element is equal to previous one
	            } else {
	                if (count > 1) {
	                    System.out.println(a[i - 1] + " is repeated " + count + " times");
	                }
	                count = 1; // Reset count for new element
	            }
	        }
	        // Check the count for the last element
	        if (count > 1) {
	            System.out.println(a[a.length - 1] + " is repeated " + count + " times");
	        }
	    }
	}


package com.kn.maxandmin;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 5, 6, 4, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {}
			System.out.println(arr[0] + " is the smallest element");
			System.out.println(arr[arr.length-1] + "is the largest element");
		}

	}



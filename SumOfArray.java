package com.kn.sumofarray;

public class SumOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 1, count = 1;
		;
		for (int i = 0; i < arr.length; i++) {

			sum = sum * i;
			count++;
		}

		System.out.println(sum);
		System.out.println(count);
		System.out.println(sum / count);

	}
}

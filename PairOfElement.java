package com.kn.pairofelement;

public class PairOfElement {

	public static void main(String[] args) {
		int a[] = { 2, 7, 4, -5, 11, 5, 20 };
		int b = 15;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i]) + (a[j]) == b) {
					System.out.println(a[i] + " and " + a[j]);
				}

			}
		}

	}

}

package com.kn.comapretwoarray;

public class Compare2ArrayEqualOrNot {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 1, 2, 3, 4 };
		int c = a.length;
		int d = b.length;

		if (c == d) {
			boolean areEqual = true;

			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					areEqual = false;
					break;
				}
			}

			if (areEqual) {
				System.out.println("Both arrays are equal");
			} else {
				System.out.println("Arrays are not equal");
			}
		} else {
			System.out.println("Arrays are not equal (different lengths)");
		}
	}
}
//if (Arrays.equals(a, b)) {
//    System.out.println("Both arrays are equal");
//} else {
//    System.out.println("Arrays are not equal");
//}
package com.kn.removeduplicate;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[]= {1,1,22,22,3,4};
		Arrays.sort(a);
		 int rd=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[rd]) {
				rd++;
				a[rd]=a[i];
				
				
			}
		}
		for(int i=0;i<=rd;i++) {
		System.out.println(a[i]);}
		

	}

}

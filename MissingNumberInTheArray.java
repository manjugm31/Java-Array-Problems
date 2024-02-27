package com.kn.missingnumberinthearray;

public class MissingNumberInTheArray {

    public static void main(String[] args) {
        // Given array
        int arr[] = {1, 2, 4, 5, 6, 7, 8, 9};
        
        // Step 1: Calculate the length of the array and add 1 to it
        int n = arr.length + 1;
        
        // Step 2: Calculate the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        // Step 3: Calculate the expected sum of consecutive numbers from 1 to n
        int expectedSum = (n * (n + 1)) / 2;
        
        // Step 4: Calculate the missing number
        int missingNumber = expectedSum - sum;
        
        // Print the missing number
        System.out.println("Missing number: " + missingNumber);
    }
}

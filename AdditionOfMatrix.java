package com.kn.additionofmatrix;

import java.util.Scanner;

public class AdditionOfMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Matrix 1 input
        System.out.println("Enter the row size of matrix 1:");
        int rows = scan.nextInt();
        System.out.println("Enter the column size of matrix 1:");
        int columns = scan.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter elements for matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // Matrix 2 input
        System.out.println("Enter the row size of matrix 2:");
        int rows2 = scan.nextInt();
        System.out.println("Enter the column size of matrix 2:");
        int columns2 = scan.nextInt();
        int[][] brr = new int[rows2][columns2];
        System.out.println("Enter elements for matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                brr[i][j] = scan.nextInt();
            }
        }

        // Matrix addition
        AdditionMatrixLogic a1 = new AdditionMatrixLogic();
        int[][] result = a1.display(arr, brr, rows, rows2, columns, columns2);

        // Displaying the result
        if (result != null) {
            System.out.println("The result matrix is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices are not compatible for addition.");
        }
    }
}

class AdditionMatrixLogic {
    public int[][] display(int[][] arr, int[][] brr, int rows, int rows2, int columns, int columns2) {
        if (rows == rows2 && columns == columns2) {
            System.out.println("Matrices are valid for addition.");
            int[][] crr = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    crr[i][j] = arr[i][j] + brr[i][j];
                }
            }
            return crr;
        } else {
            System.out.println("Matrices are not compatible for addition.");
            return null;
        }
    }
}

package com.printarray;

public class PrintArray {

	public static void toPrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("\t");
	}

	public static void toPrint(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("\t");
	}

	public static void toPrint(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("\t");
	}

	public static void main(String[] args) {
		int[] intArr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		toPrint(intArr);
		double[] doubleArr = new double[] { 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1 };
		toPrint(doubleArr);
		String[] StringArr = new String[] { "Hello,", "How", "Are", "you" };
		toPrint(StringArr);
	}

}


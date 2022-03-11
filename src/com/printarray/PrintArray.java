package com.printarray;

public class PrintArray {

	public static <E> void toPrint(E[] arr) { 				//E, Array list is a generic class
		for (E e : arr) {
			System.out.printf(e + " ");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };   // only non primitive data types to be passed
		toPrint(intArr);
		Double[] doubleArr = new Double[] { 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1 };
		toPrint(doubleArr);
		String[] StringArr = new String[] { "Hello,", "How", "Are", "you" };
		toPrint(StringArr);
	}

}


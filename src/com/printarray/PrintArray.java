package com.printarray;

public class PrintArray <T> {
	
	public void toPrint(T[] arr) { 				//E, Array list is a generic class
		for (T t : arr) {
			System.out.printf(t + " ");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };   // only non primitive data types to be passed
		PrintArray<Integer> intPrintArr = new PrintArray<Integer>();     
		intPrintArr.toPrint(intArr);
		Double[] doubleArr = new Double[] { 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1 };
		PrintArray<Double> doublePrintArr = new PrintArray<>();     
		doublePrintArr.toPrint(doubleArr);
		String[] StringArr = new String[] { "Hello,", "How", "Are", "you" };
		PrintArray<String> stringPrintArr = new PrintArray<>();
		stringPrintArr.toPrint(StringArr);
	}

}


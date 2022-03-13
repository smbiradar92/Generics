package com.testmax;

public class GenIntMax <T extends Comparable<T>> {

	public T findMax(T a, T b, T c) {
		System.out.println("The numbers are : " + a + ", " + b + ", " + c);
		T max = a;
		System.out.println(max.compareTo(b));
		System.out.println(max.compareTo(c));
		
		if (max.compareTo(b) < 0) {
			max = b;
		}
		if (max.compareTo(c) < 0) {
			max = c;
		}
		return max;
	}

	public static Float findMax(Float a, Float b, Float c) {
		System.out.println("The numbers are : " + a + ", " + b + ", " + c);
		Float max = a;

		if (max.compareTo(b) < 0) {
			max = b;
		}
		if (max.compareTo(c) < 0) {
			max = c;
		}
		return max;
	}
	public static String findMax(String a, String b, String c) {
		System.out.println("The numbers are : " + a + ", " + b + ", " + c);
		String max = a;

		if (max.hashCode() < b.hashCode()) {
			max = b;
		}
		if (max.hashCode() < c.hashCode()) {
			max = c;
		}
		return max;
	}
	public void main(String[] args) {

		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 1000);
		int c = (int) (Math.random() * 1000);

		System.out.println(MaximumTest(a, b, c));
	}

		
}

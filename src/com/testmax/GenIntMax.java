package com.testmax;

public class GenIntMax {

	public static int findMax(int a, int b, int c) {
		System.out.println("The numbers are : " + a + ", " + b + ", " + c);
		int max = a;

		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}

	public static float findMax(float a, float b, float c) {
		System.out.println("The numbers are : " + a + ", " + b + ", " + c);
		float max = a;

		if (max < b) {
			max = b;
		}
		if (max < c) {
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

	
	public  void main(String[] args) {

		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 1000);
		int c = (int) (Math.random() * 1000);

		System.out.println(findMax(a, b, c));
	}
	
}

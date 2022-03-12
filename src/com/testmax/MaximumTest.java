package com.testmax;

import org.junit.jupiter.api.Test;

public class MaximumTest {

	@Test
	public void findIntMax() {
		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 1000);
		int c = (int) (Math.random() * 1000);

		System.out.println(GenIntMax.findMax(a, b, c));
	}

	@Test
	public  void findfloatMax() {
		float a = (float) (Math.random() * 1000);
		float b = (float) (Math.random() * 1000);
		float c = (float) (Math.random() * 1000);

		System.out.println(GenIntMax.findMax(a, b, c));
	}

	@Test
	public  void findStringMax() {
		String a = "A";
		String b = "B";
		String c = "Cb";

		System.out.println(GenIntMax.findMax(a, b, c));

}
}
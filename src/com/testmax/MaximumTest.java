package com.testmax;

import org.junit.jupiter.api.Test;

public class MaximumTest {

	public
	
	@Test
	public void findIntMax() {
		GenIntMax<Integer> m = new GenIntMax<Integer>();
		Integer a = (int) (Math.random() * 1000);
		Integer b = (int) (Math.random() * 1000);
		Integer c = (int) (Math.random() * 1000);

		System.out.println(m.findMax(a, b, c));
	}
	
	@Test
	public void findfloatMax() {
		GenIntMax<Float> n = new GenIntMax<Float>();
		Float a = (float) (Math.random() * 1000);
		Float b = (float) (Math.random() * 1000);
		Float c = (float) (Math.random() * 1000);
		System.out.println(n.findMax(a, b, c));
	}
	
	@Test
	public void findStringMax() {
		GenIntMax<String> m = new GenIntMax<String>();
		String a = "A";
		String b = "B";
		String c = "Cb";

		System.out.println(m.findMax(a, b, c));
	}
}
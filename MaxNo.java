package com.bl;

public class MaxNo {
	public static Float findMax(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		System.out.printf("The max of three numbers %s %s %s is : %s \n", a, b, c, max);
		return max;
	}

	public static void main(String[] args) {
		// TestCase1 max no.is first position
		Float f1 = 99.0f, f2 = 85.0f, f3 = 60.0f;
		Float max = findMax(f1, f2, f3);

		// TestCase2 max no.is second position
		Float f4 = 34.0f, f5 = 85.0f, f6 = 25.0f;
		Float max1 = findMax(f4, f5, f6);

		// TestCase max no.is third position
		Float f7 = 25.0f, f8 = 50.0f, f9 = 100.0f;
		Float max2 = findMax(f7, f8, f9);
	}

}

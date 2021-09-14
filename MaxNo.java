package com.bl;

public class MaxNo {
	// Refacter Generic method float,integer,String
	public static <T extends Comparable<T>> T findMax(T[] Array) {

		T max = Array[0];
		for (T t : Array) {
			if (t.compareTo(max) > 0)
				max = t;
		}
		return max;
	}

	public static void main(String[] args) {

		Integer[] arrayOfInteger = { 343, 252, 453 };
		Float[] arrayOfFloats = { 292.34f, 344.43f, 334.44f };
		String[] arrayOfStrings = { "Are", "You", "Ok" };

		Integer maxOfThreeIntegerValue = findMax(arrayOfInteger);
		System.out.println("The maximum value of three integers is : " + maxOfThreeIntegerValue);

		Float maxOfThreeFloats = findMax(arrayOfFloats);
		System.out.println("The maximum value of three floats is : " + maxOfThreeFloats);

		String maxOfThreeStrings = findMax(arrayOfStrings);
		System.out.println("The maximum value of three strings is : " + maxOfThreeStrings);

	}
}

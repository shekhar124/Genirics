package com.bl;

import java.util.Scanner;

public class MaxNo {
	public static String findMax(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		System.out.printf("The max of three Strings \"%s\" \"%s\" \"%s\" is : %s \n", a, b, c, max);
		return max;
	}

	public static void main(String[] args) {
		System.out.println("enter three strings");
		Scanner scan = new Scanner(System.in);
		// TestCase enter 3 strings
		System.out.println("Enter the first String : ");
		String str1 = scan.next();
		System.out.println("Enter the second String : ");
		String str2 = scan.next();
		System.out.println("Enter the third String : ");
		String str3 = scan.next();
		String max = findMax(str1,str2,str3);
		
	}

}

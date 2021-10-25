package com.generic;

/*
 * Given an array of Integer, Double and Character, write a program to print the same
 */

public class PrintArray {

	public static void main(String[] args) {

		System.out.println("Welcome To Java Generic Print Array Program");

		// Declare and Assign Array
		Integer[] intArray = { 1, 2, 3 };
		Double[] doubleArray = { 1.1, 2.2, 3.3 };
		Character[] charArray = { 'A', 'B', 'C' };
		String[] strArray = { "Amol", "Samim", "Suraj", "Shubham" };

		// Calling Different Data Type Method
		toPrintArray(intArray);
		toPrintArray(doubleArray);
		toPrintArray(charArray);
		toPrintArray(strArray);
	}

	// Method For Integer
	private static void toPrintArray(Integer[] intArray) {
		for (int element : intArray) {
			System.out.println("To Print Integer Number: " + element);
		}

	}

	// Method For Double
	private static void toPrintArray(Double[] doubleArray) {
		for (double element : doubleArray) {
			System.out.println("To Print Double Number: " + element);
		}

	}

	// Method For Character
	private static void toPrintArray(Character[] charArray) {
		for (char element : charArray) {
			System.out.println("To Print Character : " + element);
		}

	}

	// Method For String
	private static void toPrintArray(String[] strArray) {
		for (String element : strArray) {
			System.out.println("To Print Name : " + element);
		}

	}
}

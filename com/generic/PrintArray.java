package com.generic;

/*
 * Given an array of Integer, Double and Character, 
 * write a program to print the same Using Generic
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
		System.out.println(" ");
		toPrintArray(doubleArray);
		System.out.println(" ");
		toPrintArray(charArray);
		System.out.println(" ");
		toPrintArray(strArray);
	}

	// To Calling Generic Method For Print Array Of Different Data Types
	private static <T> void toPrintArray(T[] array) {
		for (T element : array) {
			System.out.println("To Print Element:  " + element);
		}

	}

}

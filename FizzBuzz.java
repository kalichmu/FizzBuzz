package com.practice;

/**
 * @author Karishma Anand
 * 
 * This Java program outputs the numbers 1-100, with one number on every row.
 * If the number is a multiple of 3, 'F' is output instead of the number.
 * If the number is a multiple of 5, 'B' is output instead of the number.
 * If the number is a multiple of 15, 'FB' is output instead of the number.
 */
public class FizzBuzz {

	public static void main(String[] args) {

		// For loop to print numbers 1 to 100
		for (int i = 1; i <= 100; i++) {
			// Check if the number is a multiple of 15, print 'FB'
			if (i % 3 == 0 && i % 5 ==0 ) {
				System.out.println("FB");
			// Check if the number is a multiple of 5, print 'B'
			} else if (i % 5 == 0) {
				System.out.println("B");
			// Check if the number is a multiple of 3, print 'F'
			} else if (i % 3 == 0) {
				System.out.println("F");
		    // else print the number itself
			} else {
				System.out.println(i);
			}
		}
	}
}
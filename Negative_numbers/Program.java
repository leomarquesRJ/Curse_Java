package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a positive integer N (maximum = 10) and then N integers 
		 * and stores them in a vector. Then display all the negative numbers read on the screen.
		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many number you want enter? ");
		int n1 = sc.nextInt();
		
		// Create new array
		int[] vect = new int[n1];
				
		// Loop to enter numbers
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%d° Number:", i + 1);
			int n2 = sc.nextInt();
			vect[i] += n2;		
		}
		
		// Loop to verify negative numbers
		System.out.println();
		System.out.println("Negative number:");
		
		for (int i = 0; i < vect.length; i++) {
			// Show number there is negative
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}	
	sc.close();
	
	}

}

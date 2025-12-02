package Main;

import entities.Functions;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		/*	
		 * 	Mini-project to learn and practice modular functions in Java
		 *  
		 * Project: Modular Calculator
		 * 
		 * Description: 
		 * A small calculator that us separate function for each arithmetic operator
		 * 
		 * Created by: Leonardo Marques
		 * Date: 02Dez25
		 * 
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Functions functions = new Functions();
		
		// Variables
		int option;
		
		do {
			// Invoke the menu
			functions.menu();
			System.out.print("Option: ");
			option = sc.nextInt();
			sc.nextLine(); 
			
			if(option == 0) {
				// Ends and show this message if 0 was selected
				System.out.printf("Option %d selected, closing aplication.....", option);
				break;
			}
			else {
				// Asks to enter two values to be calculated
				System.out.println("Please enter two values to be calculated:");
				
				// First value
				System.out.print("First value: ");
				int n1 = sc.nextInt();
				
				// Second value
				System.out.print("Second value: ");
				int n2 = sc.nextInt();
				
				// Invoke selected operator
				switch(option) {
					case 1:
						System.out.println("=== RESULT ===");
						System.out.printf("%d + %d = %d\n", n1, n2, functions.addition(n1, n2));
						System.out.println("==============");
						System.out.println();
						break;
						
					case 2:
						System.out.println("=== RESULT ===");
						System.out.printf("%d - %d = %d\n", n1, n2, functions.subtraction(n1, n2));
						System.out.println("==============");
						System.out.println();
						break;
						
					case 3:
						System.out.println("=== RESULT ===");
						System.out.printf("%d x %d = %d\n", n1, n2, functions.multiplication(n1, n2));
						System.out.println("==============");
						System.out.println();
						break;
						
					case 4:
						System.out.println("=== RESULT ===");
						System.out.printf("%d / %d = %.1f\n", n1, n2, functions.division(n1, n2));
						System.out.println("==============");
						System.out.println();
						break;
						
					default:						
						System.out.println("Error, invalid option!");
						System.out.println();
						break;
				}
			}
	
				
				
			}while(option != 0);
		
		sc.close();
	
	}

}

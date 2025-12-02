package entities;


public class Functions {
	
	// Addition
	public int addition(int n1, int n2) {
		return n1 + n2;
	}
	
	// Subtraction
	public int subtraction(int n1, int n2) {
		return n1 - n2;
	}
	
	// Multiplication
	public int multiplication(int n1, int n2) {
		return n1 * n2;
	}
	
	// Division
	public double division(double n1, double n2) {
		// Verify if division is by zero
		if(n2 / 2 == 0) {
			System.out.println("Division by zero not allowed");
			return 0;
		}
		else {
			return n1 / n2;
		}
	}
	
	// Menu
	public void menu() {
		System.out.println("==== MODULAR CALCULATOR ====");
		System.out.println("(1) - Addition");
		System.out.println("(2) - Subtration");
		System.out.println("(3) - Multiplication");
		System.out.println("(4) - Division");
		System.out.println("(0 - CLOSE");
		System.out.println();

	}
	
}

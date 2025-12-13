package aplication;
import java.util.Scanner;
import entities.People;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Quantas pessoas quer cadastrar? ");
		int n = sc.nextInt();
		sc.nextLine(); // Remove empty line
		
		// Create object people
		People[] vect = new People[n];
		
		double sumHeight = 0.0;
		int countUnder16 = 0;
		
		// Loop
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("=== %d° PESSOA ===%n", i + 1);
			
			// Enter name
			System.out.print("Name: ");
			String newName = sc.nextLine().toUpperCase();
			
			// Enter age
			System.out.print("Age: ");
			int newAge = sc.nextInt();
			
			// Testing valid years
			while(newAge< 1 || newAge > 99) {
				System.out.println("Please enter valid year between 1 and 99:");
				System.out.println("Years: ");
				newAge = sc.nextInt();	
			}
			
			// Enter height
			System.out.print("Height: ");
			double newHeight = sc.nextDouble();
			
			// Testing valid height
			while(newHeight < 0.50 || newHeight > 2.99 ) {
				System.out.println("Please enter a valid height between 0.50 and 2.99");
				System.out.print("Height: ");
				newHeight = sc.nextDouble();
			}
			// Create new people
			vect[i] = new People(newName, newAge, newHeight);
			
			// Calculate
			sumHeight += vect[i].getHeight();
			
			// Count ages under 16
			if (vect[i].getAge() < 16) {
				countUnder16++;
			}
			sc.nextLine();
			
		}
		
		double averageHeight = sumHeight / vect.length;
		double percentageUnder16 = (double)(countUnder16 * 100) / vect.length;
		
		// Show average height
		System.out.printf("Altura média: %.2f%n", averageHeight);
		// Show quantity of people under 16 in percentage
		System.out.printf("Percentage of people under 16: %.1f%%%n", percentageUnder16);
		
		// Show name of the peoples under 16
		System.out.println("Names of people under 16:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.printf("%s%n", vect[i].getName());
			}
		}

		sc.close();
	}

}

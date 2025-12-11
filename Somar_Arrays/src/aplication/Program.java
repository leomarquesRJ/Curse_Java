package aplication;

import java.util.Scanner;
import java.text.Format;
import java.util.Arrays;
import java.util.Locale;

public class Program {
	

	public static void main(String[] args) {
		/* 
		 * 
		 * Description:
		 * Programa qe ler N números reais e armazena em m array.
		 * 
		 * Função:
		 * - Imprimir todos os elementos do array
		 * - Mostrar a seoma e a média dos elementos 
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double soma = 0.0;
		
		System.out.print("Quantos numeros deseja digitar? ");
		int n1 = sc.nextInt();
		sc.nextLine();
		
		// Cria um array do tipo double com tamnho de n1 w nome de vect
		double[] vect = new double[n1];
		
		
		
		// Loop para ler os numeros digitados
		for (int i = 0; i < vect.length; i++) {
			System.out.println();
			System.out.printf("Digite o %d° numero: ", i + 1);
			vect[i] += sc.nextDouble();		
			
			// Soma todos os valores do array
			soma += vect[i];	
		}
		
		// Saida
		System.out.println();
		System.out.println("------------------");
		System.out.print("Valores = ");
		for (int i = 0; i < vect.length; i++ ) {
			System.out.printf("%.1f, ", vect[i]);
		}
		System.out.printf("%nSoma = %.2f%n", soma);
		System.out.printf("Media = %.2f%n", soma / vect.length);
	
		sc.close();

	}

}

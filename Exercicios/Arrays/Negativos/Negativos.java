import java.util.Scanner;

public class Negativos{
	
	public static void main(String[] args){
		/*
		 Lê N (máximo 10) números e imprime apenas os negativos
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int quantidade = scan.nextInt();
		
		while(quantidade > 10 || quantidade <= 0) {
			System.out.println("Tamanho inválido, o valor deve ser entre 1 e 10.");
			quantidade = scan.nextInt();
		}
		
		int[] numeros = new int[quantidade];
		
		for(int i = 0; i < numeros.length; i++) {
		 numeros[i] = scan.nextInt();
		}
		
		
		boolean verificador = false;
		
		for(int num : numeros) {
			if(num < 0) {
				System.out.printf("%d é negativo%n", num);
				verificador = true;
			}

		}
		
		if(!verificador) {
			System.out.println("Não existe número negativo no vetor.");
		}
		
		scan.close();
	}
}
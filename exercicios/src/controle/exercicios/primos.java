package controle.exercicios;

import java.util.Scanner;

public class primos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int totalDivisores = 0;
		
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				totalDivisores++;
			}
		}
		
		if (totalDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}
		entrada.close();
	}
}

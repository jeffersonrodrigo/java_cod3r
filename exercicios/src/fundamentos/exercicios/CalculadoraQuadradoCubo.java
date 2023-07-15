package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraQuadradoCubo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o número para ser calculado em quadrado e em cubo");
		double numero = entrada.nextDouble();
		double quadrado = Math.pow(numero, 2);
		double cubico = Math.pow(numero, 3);
		System.out.println(
				"O numero " + numero + " tem o seu valor ao quadrado: " + quadrado + " e seu valor ao cubo: " + cubico);

		entrada.close();
	}
}

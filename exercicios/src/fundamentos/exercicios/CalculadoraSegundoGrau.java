package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraSegundoGrau {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Resolver equações do segundo grau (ax2 + bx + c = 0)");
		System.out.println("Insira o valor de A: ");
		double a = entrada.nextDouble();
		System.out.println("Insira o valor de B: ");
		double b = entrada.nextDouble();
		System.out.println("Insira o valor de C: ");
		double c = entrada.nextDouble();
		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("O valor de delta é: " + delta);
		entrada.close();
	}
}

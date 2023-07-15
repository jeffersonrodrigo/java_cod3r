package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraAreaTriangulo {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Calcular a área do triângulo");
		System.out.println("Insira o valor da base: ");
		double base = entrada.nextDouble();
		System.out.println("Insira o valor da altura: ");
		double altura = entrada.nextDouble();
		double area = (base * altura) / 2;
		System.out.println("O valor da área do triângulo é de " + area);
		entrada.close();
	}
}

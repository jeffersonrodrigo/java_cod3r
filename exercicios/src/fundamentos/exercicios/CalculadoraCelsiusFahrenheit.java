package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraCelsiusFahrenheit {
	public static void main(String[] args) {
		// (20 °F − 32) × 5/9 = -6,667 °C

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a temperatura em Fahrenheit para ser convertida em Celsius: ");
		int fahrenheit = entrada.nextInt();
		double acerto = 5.0 / 9.0;
		double celsius = (fahrenheit - 32) * acerto;
		System.out.println("A temperatura em Celsius é de: " + celsius + "°C.");

		entrada.close();
	}
}

package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();

		if (dia.toLowerCase().equals("domingo")) {
			System.out.println("1");
		} else if (dia.toLowerCase().equals("segunda")) {
			System.out.println("2");
		} else if (dia.toLowerCase().equals("terça")) {
			System.out.println("3");
		} else if (dia.toLowerCase().equals("quarta")) {
			System.out.println("4");
		} else if (dia.toLowerCase().equals("quinta")) {
			System.out.println("5");
		} else if (dia.toLowerCase().equals("sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("sabado")) { // Outra opção (e melhor) seria usar diretamente o
														// .equalsIgnoreCase
			System.out.println("7");
		}

		System.out.println("Fim!");

		entrada.close();
	}
}
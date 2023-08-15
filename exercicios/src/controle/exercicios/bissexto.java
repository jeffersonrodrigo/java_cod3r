package controle.exercicios;

import java.util.Scanner;

public class bissexto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");

		int ano = entrada.nextInt();

		if (ano % 4 == 0) {
			System.out.println("O ano " + ano + " é um ano bissexto.");
		} else {
			System.out.println("O ano " + ano + " não é um ano bissexto.");
		}

		entrada.close();
	}
}

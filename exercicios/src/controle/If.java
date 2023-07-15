package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabens");
		}

		if (media <= 7.0 && media >= 4.5)
			System.out.println("Recuperação"); // Se houvesse uma segunda sentença sem estar dentro de um bloco só
												// executaria essa linha

		if (media <= 4.5 && media >= 0)
			System.out.println("Reprovado");

		entrada.close();
	}
}
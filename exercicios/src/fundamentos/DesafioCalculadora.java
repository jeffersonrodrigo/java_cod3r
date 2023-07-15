package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double valor1 = entrada.nextDouble();
		System.out.println("Digite o operador: ");
		String operador = entrada.next();
		System.out.println("Digite o segundo número: ");
		double valor2 = entrada.nextDouble();
		
		double resultado = "+".equals(operador) ? valor1 + valor2 : 0;
		resultado = "-".equals(operador) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operador) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operador) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operador) ? valor1 % valor2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", valor1, operador, valor2, resultado );
		
		entrada.close();
	}
}

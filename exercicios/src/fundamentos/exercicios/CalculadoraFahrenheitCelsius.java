package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraFahrenheitCelsius {

	public static void main(String[] args) {
		// (0 °C × 9/5) + 32 = 32 °F

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em celsius para ser convertida em Fahrenheit: ");
        int celsius = entrada.nextInt();
        double acerto = 9.0/5.0;
        double fahrenheit = (celsius * acerto) + 32;
        System.out.println("A temperatura em Fahrenheit é de: " + fahrenheit + "°F.");
        
        entrada.close();
	}
}

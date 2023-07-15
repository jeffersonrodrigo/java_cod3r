package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final int AJUSTE = 32;
		final double FATOR = 5.0/9; // ao dividir numeros inteiros tem que ter cuidado pois o java só resolve quando são numeros divisiveis. Caso nao sejam usar float colocando .zero para a divisao funcionar
		
		double fahrenheit = 55;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(celsius);
	}
}

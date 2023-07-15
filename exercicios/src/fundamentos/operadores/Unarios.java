package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		b++; // b = b + 1
		b--; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--);
		System.out.println("A resposta acima é verdadeira pois a atribuição do a foi precedente a comparação e a comparação foi precedente ao decremento de b. "
				+ "\nLogo houve o incremento o valor de a se igualou ao de b o que gerou a resposta verdadeira e em seguida houve o decremento de b onde fará que a proxima comparação mostre que os valores são diferentes");
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}

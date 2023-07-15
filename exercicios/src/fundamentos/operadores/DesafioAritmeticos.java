package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // O método Math.pow() retorna um valor do tipo double, que é um tipo primitivo de ponto flutuante com maior precisão do que o tipo int.
		double c = Math.pow(a, 3); // aqui como ja definimos a variavel como double não ha problema. A diferença é q o resultado sera exibido com ponto flutuante
		
		System.out.println(b);
		System.out.println(c);
		
		
		double Fracao1 = (Math.pow((6 * (3 + 2)), 2)) / (3 * 2);
		System.out.println(Fracao1);
		
		double Fracao2 = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
		System.out.println(Fracao2);
		
		double Numerador1 = Math.pow((Fracao1 - Fracao2), 3);
		double FracaoFinal = Numerador1 / Math.pow(10, 3);
		System.out.println("O resultado do desafio de expressões aritimeticas com Java é: " + FracaoFinal);
	}
}

package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // como aqui está dividindo dois inteiros o resultado será um inteiro
		System.out.println(a / (double) b); // para o valor ser quebrado fiz a conversão explicita do int para double
		
		System.out.println(a % b); // módulo é representado pelo simbolo % onde é o resto da divisão
	}
}

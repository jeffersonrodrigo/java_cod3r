package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		//a = "...";
		
		var b = 4.5; // ao colocar var o java vai inferir de qual tipo a variavel pertence e atribuir a ela
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";// caso tente atribuir um novo valor de um mesmo tipo que ja foi inferido antes nao havera problema. No entanto caso seja de outro tipo dará erro
		System.out.println(c);
		// c = 4.5;
		
		double d; //variável foi declarada
		d = 123.65; //variável foi inicializada
		System.out.println(d); // usada!!
	}
}

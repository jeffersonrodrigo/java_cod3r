package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // Por convenção nome de constantes em maiuscula
		double area = PI* raio * raio;
		
		System.out.println(area);
		
		raio = 10; // Como as variáveis raio e area ja foram definidas anteriormente nao precisa dizer novamente o tipo delas
		area = PI * raio * raio;
		System.out.println("Área é= " + area + "m2.");
	}
}

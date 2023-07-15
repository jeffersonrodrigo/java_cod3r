package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia X"; // Para definir string tem que utilizar o S maiúsculo
		s = s.replace("X", "Senhora"); // No caso para substituir o X ele deve estar escrito da mesma forma. É case sensitive
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Jeff")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		System.out.println(y.length()); //pode usar notação ponto dentro do syso
		// Tipos primitivos não tem o operador "."
		// int a = 3;
	}
}

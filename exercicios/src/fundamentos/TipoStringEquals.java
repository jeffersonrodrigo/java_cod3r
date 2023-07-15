package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); // false
		//Em Java, quando você usa o operador de igualdade == para comparar strings, ele verifica se as referências das strings são iguais, ou seja, se elas se referem ao mesmo objeto na memória.
		System.out.println("2".equals(s1)); // true. O método equals() verifica se o conteúdo das strings é igual.
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}

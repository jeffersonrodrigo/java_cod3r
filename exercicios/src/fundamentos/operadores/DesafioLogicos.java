package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean compraTV50 = trabalho1 && trabalho2;
		boolean compraTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = compraTV50 || compraTV32;
		
		System.out.println("Comprou TV 32\"?\n" + compraTV32);
		System.out.println("Comprou TV 50\"?\n" + compraTV50);
		System.out.println("Comprou sorvete\"?\n" + comprouSorvete);
		
	}
}


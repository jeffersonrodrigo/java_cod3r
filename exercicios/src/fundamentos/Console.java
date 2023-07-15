package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n"); //O print sem ln nao cria uma nova linha assim os dois serão escritos na mesma linha. pode usar o \n para criar uma nova linha para o proximo comando
		
		System.out.println("Bom");//O print ln cria uma nova linha abaixo, ou seja, o comando em si não é gerado em uma nova linha
		System.out.println(" dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f \n", 1234.5678);
		System.out.printf("Nome: %s\n", "Jefferson");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); // Para numeros tem q colocar int como o tipo de variavel e nextInt verifica se a proxima entrada é um inteiro
		
		
		
		System.out.printf(" %s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close();
	}
}

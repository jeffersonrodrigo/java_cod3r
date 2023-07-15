package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0)); //Ver o caractere do indice indicado
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));// começa com(case sensitive)
		System.out.println(s.toLowerCase().startsWith("boa")); //primeiro está deixando todas as letras em minúscula antes de fazer a verificação
		System.out.println(s.toUpperCase().endsWith("TARDE"));//primeiro está deixando todas as letras em maiscula antes de fazer a verificação
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde")); //Compara as strings(case sensitive)
		System.out.println(s.equalsIgnoreCase("boa tarde")); //Compara as strings(ignorando case sensitive)
		
		//Variaveis com var são inferidas pelo Java
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n");
		
		//O método System.out.printf() é usado em Java para formatar e exibir uma string formatada no console.
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}

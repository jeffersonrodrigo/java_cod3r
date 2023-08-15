package controle.exercicios;

import java.util.Scanner;

public class mediaNotas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double nota1 = 0;		
		double nota2 = 0;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
	    System.out.println("Digite a segunda nota: ");
	    nota2 = entrada.nextDouble();
	    
	    double media = (nota1 + nota2) / 2;
	    
	    if(media >= 7 && media <= 10) {
	    	System.out.println("A média das notas é: " + media + "\nO aluno foi aprovado!!" );
	    } else if(media >= 4 && media < 7) {
	    	System.out.println("A média das notas é: " + media + "\nO aluno está de recuperação." );
	    } else if(media >= 0 && media < 4) {
	    	System.out.println("A média das notas é: " + media + "\nO aluno está reprovado" );
	    } else {
	    	System.out.println("A média foi um valor inválido");
	    }
		entrada.close();
	}
}

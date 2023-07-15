package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		/*
		 * Ao se usar valores literais o Java só consegue interpretar o tipo dele: Se é int ou se é double.
		 * Por esse motivo como os tipos de variavéis byte, short e claro int cabem dentro do espaço reservado para int não é preciso fazer nada além de declara-los.
		 * No entanto ao declarar um número iteiro que ultrapasse o tamanho int deve-se colocar um L ao final do mesmo (podendo ser maiusculo ou minusculo)
		 */
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // Por ultrapassar o tamanho de um int deve-se marcar com um L para entender que é um long
	
		// Tipos numéricos reais
		/*
		 * Assim como no caso dos numeros inteiros, nos números com ponto flutuante o Java interpretará como sendo do tipo DOUBLE.
		 * Para que se possa marcar de fato como um float deve-se utilizar um F ao final do mesmo (podendo ser maiusculo ou minusculo)
		 */
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A'; //ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa *365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println("O funcionário de ID = " + id + ", ganha: R$" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}

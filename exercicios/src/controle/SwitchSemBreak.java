package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {

		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan\n\n");
		}

		String plano = "essencial";

		switch (plano.toLowerCase()) {
		case "essencial":
			System.out.println("Plano essencial" + "Exames de Alta Complexidade\n\n"
					+ "Além dos beneficios dos planos Ideal e Tranquilo\n");
		case "ideal":
			System.out.println("Plano Ideal:" + "Especialistas\n" + "Exames cardiológicos\n" + "Cirurgias\n"
					+ "Anestesia inalatória\n" + "Internação\n\n" + "Além dos beneficios do plano Tranquilo\n");
		case "tranquilo":
			System.out.println("Plano Tranquilo:" + "Consultas em horário de plantão\n" + "Vacinas obrigatórias\n"
					+ "Procedimentos clínicos\n" + "Consultas em horário normal\n" + "Microchipagem gratuita\n"
					+ "Clínico geral a domicílio\n" + "Exames laboratoriais simples\n"
					+ "Exames laboratoriais complexos\n" + "Exames de imagem");
		}
	}
}
package br.com.snake.models;


public class Mensagens {

	public void apresentação() {
		System.out.println("========================================================");
		for(int i = 0; i<7;i++) System.out.println();
		System.out.println(" █▀▀▀█ █▀▀▄ █▀▀█ █░█ █▀▀   █▀▀█ █▀▀█ █▀▄▀█ █▀▀");
		System.out.println(" ▀▀▀▄▄ █░░█ █▄▄█ █▀▄ █▀▀   █░▄▄ █▄▄█ █░▀░█ █▀▀");
		System.out.println(" █▄▄▄█ ▀░░▀ ▀░░▀ ▀░▀ ▀▀▀   █▄▄█ ▀░░▀ ▀░░░▀ ▀▀▀");
		System.out.println(" Prepare-se, o jogo vai começar...");
		System.out.println(" 🐍🐍🐍🐍🐍 REGRAS 🐍🐍🐍🐍🐍");
		System.out.println(" 1 - Pegue todas as flores para ganhar o jogo.");
		System.out.println(" 2 - Caso toque na borda ou no nome, você perde!");
		System.out.println();
		System.out.println("SELECIONE A DIFICULDADE DO JOGO");
		System.out.println("🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍");
		System.out.println("1 - Fácil");
		System.out.println("2 - Médio");
		System.out.println("3 - Difícil");
		for (int i = 0; i < 7; i++)System.out.println();
		System.out.println("========================================================");
	}


	public void perdeu() {
		System.out.println();
		System.out.println("█▀▀▀ ░▀░ █▀▄▀█   █▀▀▄ █▀▀   ░░▒█ █▀▀█ █▀▀▀ █▀▀█ ░ ░ ░   ");
		System.out.println("█▀▀▀ ▀█▀ █░▀░█   █░░█ █▀▀   ▄░▒█ █░░█ █░▀█ █░░█ ░ ░ ░   ");
		System.out.println("█░░░ ▀▀▀ ▀░░░▀   ▀▀▀░ ▀▀▀   █▄▄█ ▀▀▀▀ ▀▀▀▀ ▀▀▀▀ █ █ █   ");
		System.out.println("INFELIZMENTE VOCÊ PERDEU :(  ");
	}

	public void ganhador() {
		System.out.println();
		System.out.println(" █░░▒█ █▀▀▀█ █░▒█   █░░▒█ ▀█▀ █▄░▒█ █ █ █");
		System.out.println(" █▄▄▄█ █░░▒█ █░▒█   █▒█▒█ ░█░ █▒█▒█ ▀ ▀ ▀");
		System.out.println(" ░▒█░░ █▄▄▄█ ▀▄▄▀   █▄▀▄█ ▄█▄ █░░▀█ ▄ ▄ ▄");
		trofeu();
	}
	

	private void trofeu() {

		System.out.println("              ___________\r\n"
				+ "            '._==_==_=_.'\r\n"
				+ "            .-\\:      /-.\r\n"
				+ "           | (|:.     |) |\r\n"
				+ "            '-|:.     |-'\r\n"
				+ "              \\::.    /\r\n"
				+ "               '::. .'\r\n"
				+ "                 ) (\r\n"
				+ "               _.' '._");
	}
}

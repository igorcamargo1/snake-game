package br.com.snake.models;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Jogo extends JFrame implements KeyListener {

	private int linhaAtual = 2;
	private int colunaAtual = 4;
	private int setaPressionada;
	private Tabuleiro tabuleiro = new Tabuleiro();
	private int FloresCapturadas;
	private Mensagens msg = new Mensagens();

	public Jogo() {
		// tamanho do JFrame
		setSize(200, 100);
		// Define que se o programa for encerrado ele fecha junto
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Define o JFrame como visível
		setVisible(true);
		// a classe atual implementa a interface KeyListener
		addKeyListener(this);
		// permite que o JFrame receba o foco do teclado.
		setFocusable(true);
	}

	// Pega o key code da seta que foi digitada pelo usuário
	@Override
	public void keyPressed(KeyEvent e) {
		setaPressionada = e.getKeyCode();
	}

	private long dificuldadeJogo() {

		int dificuldade = 0;
		while (true) {
			this.msg.apresentação();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Erro inesperado, nos desculpe...");
			}

			dificuldade = setaPressionada;
			if (dificuldade == KeyEvent.VK_1) {
				dificuldade = 200;
				break;
			} else if (dificuldade == KeyEvent.VK_2) {
				dificuldade = 150;
				break;

			} else if (dificuldade == KeyEvent.VK_3) {
				dificuldade = 100;
				break;
			}

		}

		return dificuldade;
	}

	// inicia o jogo e cria uma Thread paralela a principal
	public void startGame() {

		long dificuldade = dificuldadeJogo();

		int linhas = this.tabuleiro.getLinhas();
		int colunas = this.tabuleiro.getColunas();

		Thread gameThread = new Thread(() -> {
			while (true) {
				// Lógica para manipular as teclas
				int keyCode = setaPressionada;
				switch (keyCode) {
				case KeyEvent.VK_UP:
					if (linhaAtual > 0)
						linhaAtual--;
					break;
				case KeyEvent.VK_DOWN:
					if (linhaAtual < linhas - 1)
						linhaAtual++;
					break;
				case KeyEvent.VK_LEFT:
					if (colunaAtual > 0)
						colunaAtual--;
					break;
				case KeyEvent.VK_RIGHT:
					if (colunaAtual < colunas - 1)
						colunaAtual++;
					break;
				}

				// Verifica a posição após mover a cobra
				verificaPosicaoSnake(linhaAtual, colunaAtual);
				atualizaPosicaoFlor(linhaAtual, colunaAtual);

				// Atualiza a visualização do tabuleiro
				colocaSnake();
				this.tabuleiro.imprimiTabuleiro();

				// Adicione um pequeno atraso para controlar a velocidade do jogo
				try {
					Thread.sleep(dificuldade); // Tempo de atualização da tela
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		gameThread.start();
	}

	// Coloca a Snake na posição inicial e atualiza de acordo com os comandos do
	// usuário
	private void colocaSnake() {
		this.tabuleiro.colocaFlor(FloresCapturadas);
		for (int linha = 0; linha < this.tabuleiro.getLinhas(); linha++) {
			for (int coluna = 0; coluna < this.tabuleiro.getColunas(); coluna++) {
				if (linha == linhaAtual && coluna == colunaAtual) {
					this.tabuleiro.matriz[linha][coluna] = "§";
				}
			}
		}
	}

	// Verifica se a posição não está sendo ocupada por uma letra ou pela borda
	private void verificaPosicaoSnake(int linhaAtual, int colunaAtual) {

		if (this.tabuleiro.matriz[linhaAtual][colunaAtual] == this.tabuleiro.getBorda()
				|| this.tabuleiro.matriz[linhaAtual][colunaAtual] == this.tabuleiro.getCaracter()) {

			msg.perdeu();
			System.exit(0);
		}
		if (FloresCapturadas == 3) {
			msg.ganhador();
			System.exit(0);
		}
	}

	private void atualizaPosicaoFlor(int linhaAtual, int colunaAtual) {
		if (this.tabuleiro.matriz[linhaAtual][colunaAtual] == "♣") {
			FloresCapturadas++;
		}
	}

	// implementa os métodos padrões da interface
	@Override
	public void keyTyped(KeyEvent e) {
		// Não utilizado
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Não utilizado
	}

}

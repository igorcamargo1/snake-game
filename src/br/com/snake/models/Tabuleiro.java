package br.com.snake.models;

public class Tabuleiro {

	private final int linhas = 28;
	private final int colunas = 144;
	public String[][] matriz = new String[linhas][colunas];
	private String caracter = "▓";
	private String espaco = " ";
	private String borda = "▓";
	private String flor = "♣";
	

	public void preencheNome() {
		// borda =======================================
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {

				if (linha == 0 || linha == linhas - 1 || coluna == 0 || coluna == colunas - 1) {
					matriz[linha][coluna] = borda;
					System.out.println();
				}
				// imprimi C
				else if (linha >= 5 && linha <= 7 && coluna >= 4 && coluna <= 19
						|| linha >= 21 && linha <= 23 && coluna >= 4 && coluna <= 19
						|| linha >= 8 && linha <= 20 && coluna >= 4 && coluna <= 6) {
					matriz[linha][coluna] = caracter;
				}
				// imprimi A
				else if (linha >= 5 && linha <= 6 && coluna >= 27 && coluna <= 36
						|| linha == 7 && coluna >= 25 && coluna <= 38
						|| linha >= 8 && linha <= 9 && coluna >= 24 && coluna <= 39
						|| linha >= 10 && linha <= 11 && coluna >= 23 && coluna <= 27
						|| linha >= 10 && linha <= 11 && coluna >= 36 && coluna <= 40
						|| linha >= 12 && linha <= 14 && coluna >= 23 && coluna <= 24
						|| linha >= 12 && linha <= 14 && coluna >= 39 && coluna <= 40
						|| linha >= 15 && linha <= 18 && coluna >= 23 && coluna <= 40
						|| linha >= 19 && linha <= 23 && coluna >= 23 && coluna <= 25
						|| linha >= 19 && linha <= 23 && coluna >= 38 && coluna <= 40) {
					matriz[linha][coluna] = caracter;
				}
				// imprimi M
				else if (linha >= 5 && linha <= 23 && coluna >= 44 && coluna <= 46
						|| linha >= 5 && linha <= 23 && coluna >= 57 && coluna <= 59
						|| linha >= 5 && linha <= 7 && coluna >= 44 && coluna <= 50
						|| linha >= 5 && linha <= 7 && coluna >= 53 && coluna <= 59
						|| linha >= 5 && linha <= 12 && coluna >= 48 && coluna <= 50
						|| linha >= 5 && linha <= 12 && coluna >= 53 && coluna <= 55
						|| linha >= 13 && linha <= 15 && coluna >= 49 && coluna <= 54) {
					matriz[linha][coluna] = caracter;
				}
				// imprimi A
				else if (linha >= 5 && linha <= 6 && coluna >= 69 && coluna <= 77
						|| linha == 7 && coluna >= 66 && coluna <= 79
						|| linha >= 8 && linha <= 9 && coluna >= 65 && coluna <= 80
						|| linha >= 10 && linha <= 11 && coluna >= 63 && coluna <= 68
						|| linha >= 10 && linha <= 11 && coluna >= 77 && coluna <= 82
						|| linha >= 12 && linha <= 14 && coluna >= 63 && coluna <= 65
						|| linha >= 12 && linha <= 14 && coluna >= 80 && coluna <= 82
						|| linha >= 15 && linha <= 18 && coluna >= 63 && coluna <= 82
						|| linha >= 19 && linha <= 23 && coluna >= 63 && coluna <= 66
						|| linha >= 19 && linha <= 23 && coluna >= 79 && coluna <= 82) {
					matriz[linha][coluna] = caracter;
				}
				// imprimi R
				else if (linha >= 5 && linha <= 23 && coluna >= 86 && coluna <= 88
						|| linha >= 5 && linha <= 8 && coluna >= 86 && coluna <= 99
						|| linha >= 7 && linha <= 11 && coluna >= 95 && coluna <= 101
						|| linha >= 12 && linha <= 13 && coluna >= 95 && coluna <= 99
						|| linha >= 14 && linha <= 16 && coluna >= 86 && coluna <= 97
						|| linha == 17 && coluna >= 86 && coluna <= 95
						|| linha >= 18 && linha <= 21 && coluna >= 93 && coluna <= 97
						|| linha >= 20 && linha <= 21 && coluna >= 98 && coluna <= 101
						|| linha >= 22 && linha <= 23 && coluna >= 99 && coluna <= 102) {
					matriz[linha][coluna] = caracter;
				}
				// imprimi G
				else if (linha >= 5 && linha <= 9 && coluna >= 106 && coluna <= 120
						|| linha >= 7 && linha <= 21 && coluna >= 105 && coluna <= 107
						|| linha >= 10 && linha <= 11 && coluna >= 117 && coluna <= 120
						|| linha >= 14 && linha <= 17 && coluna >= 110 && coluna <= 120
						|| linha >= 18 && linha <= 21 && coluna >= 114 && coluna <= 117
						|| linha >= 18 && linha <= 23 && coluna >= 119 && coluna <= 120
						|| linha >= 20 && linha <= 23 && coluna >= 106 && coluna <= 115) {
					matriz[linha][coluna] = caracter;
				}
				// imprimi O
				else if (linha >= 7 && linha <= 21 && coluna >= 124 && coluna <= 126
						|| linha >= 5 && linha <= 8 && coluna >= 126 && coluna <= 137
						|| linha >= 7 && linha <= 21 && coluna >= 137 && coluna <= 139
						|| linha >= 20 && linha <= 23 && coluna >= 126 && coluna <= 137) {
					matriz[linha][coluna] = caracter;
				} else {
					matriz[linha][coluna] = espaco;
				}
			}
		}

	}

	public void imprimiTabuleiro() {

		// imprimir =========================================
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {

				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
	}

	public void colocaFlor(int posicaoFlor) {
		preencheNome();
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {

				if (posicaoFlor == 0) {
					if (linha == 25 && coluna == 33) {
						matriz[linha][coluna] = flor;
					}
				} else if (posicaoFlor == 1) {
					if (linha == 4 && coluna == 62) {
						matriz[linha][coluna] = flor;
					}
				} else {
					if (linha == 22 && coluna == 93) {
						matriz[linha][coluna] = flor;
					}
				}
			}
		}
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public String getCaracter() {
		return caracter;
	}

	public String getBorda() {
		return borda;
	}

}

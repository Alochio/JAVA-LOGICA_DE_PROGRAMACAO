/*
 * A IDEIA PRINCIPAL DESSE EXERCICIO ERA TRABALHAR COM O RECOLHIMENTO
 * DE DADOS DO TECLADO, TRABALHAR COM ALGUMAS CONDIÇÕES, E POR FIM,
 * CALCULAR QUANTO FOI O TEMPO GASTO EM EXECUÇÃO POR ESSE PROGRAMA.
 */

package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double tempoAntigo = System.currentTimeMillis();
		double tempoGasto;
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Ola " + nome + ", digite uma mensagem: ");
		String mensagem = scanner.nextLine();

		if (mensagem.length() <= 10) {
			System.out.println("A sua mensagem e muito curta, digite novamente: ");
			mensagem = scanner.nextLine();
			if (mensagem.length() <= 10)
				System.out.println("A mensagem continua curta, estamos encerrando o programa!!");
			else
				System.out.println("Mensagem de " + nome + ": \n" + mensagem);
		}

		double tempoAtual = System.currentTimeMillis();

		tempoAntigo = convertTime(tempoAntigo);
		tempoAtual = convertTime(tempoAtual);

		tempoGasto = tempoAtual - tempoAntigo;

		System.out.println("O tempo gasto na execucao desse programa foi de : " 
				+ tempoGasto + " segs");

	}

	public static double convertTime(double time) {
		return time / 1000;
	}
}
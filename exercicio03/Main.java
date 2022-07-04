/*
 * ESTE EXERCICIO TEVE O INTUIDO DE REALIZAR A CRIAÇÃO DE UM
 * JOGO, ONDE SERIA REALIZADAS PERGUNTAS PARA O USUARIO, E ELE
 * TERIA QUE RESPONDER, E NO FIM, MOSTRAR A SUA PONTUAÇÃO.
 * O MODO QUE FOI MOSTRADO NA AULA FOI UM POUCO DIFERENTE,
 * UTILIZEI DA CRIATIVIDADE PARA IMPLEMENTAR COISAS NOVAS NO
 * JOGO.
 */

package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nome;
		String continua;
		int auxContinua;
		int pontos = 0;
		int numQuestao = 0;

		System.out.println("Seja bem vindo ao nosso game!!");
		System.out.println("Digite o seu nome: ");
		nome = scanner.nextLine();

		System.out.println("Ola " + nome + ", deseja comecar nosso jogo? (s) ou (n)");
		continua = scanner.nextLine();
		auxContinua = continuar(continua);

		for (int i = 0; numQuestao < 6; i++) {
			if (auxContinua == 0) {
				int auxParaPrint = i + 1;
				System.out.println("QUESTAO " + auxParaPrint);
				perguntas(numQuestao, pontos, auxContinua);
				pontos = pontos + 1;
			} else if (auxContinua != 0) {
				finalizaJogo(auxContinua, pontos);
			}
			numQuestao = numQuestao + 1;
		}
	}

	public static int continuar(String continua) {
		if (continua.equals("s"))
			return 0;
		else if (continua.equals("n"))
			return 1;
		else
			return 2;
	}

	public static void finalizaJogo(int auxContinua, int pontos) {
		if (auxContinua == 0) {
		} else if (auxContinua == 1) {
			System.out.println("Jogo encerrado, sua pontuacao foi de " + pontos + " pontos! ");
			System.exit(auxContinua);
		} else {
			System.out.println("Valor digitado, incorreto!! ");
			System.exit(0);
		}
	}

	public static void acertou(int pontos) {
		pontos = pontos + 1;
		System.out.println("Voce acertou, pontos: " + pontos);
	}

	public static void perguntas(int numQuestao, int pontos, int auxContinua) {

		Scanner sc = new Scanner(System.in);
		String resposta;
		String respostaCorreta;
		String continua;

		switch (numQuestao) {

		case 0:
			System.out.println("Qual a capital do Brasil?");
			resposta = sc.nextLine();
			respostaCorreta = "Brasilia";

			if (resposta.equals(respostaCorreta)) {
				acertou(pontos);
				System.out.println("Deseja continuar? (s) ou n");
				continua = sc.nextLine();
				auxContinua = continuar(continua);
				finalizaJogo(auxContinua, pontos);
			} else {
				auxContinua = 1;
				System.out.println("Voce errou!!");
				finalizaJogo(auxContinua, pontos);
			}
			break;

		case 1:
			System.out.println("Qual a capital do Espirito Santo?");
			respostaCorreta = "Vitoria";
			resposta = sc.nextLine();

			if (resposta.equals(respostaCorreta)) {
				acertou(pontos);
				System.out.println("Deseja continuar? (s) ou n");
				continua = sc.nextLine();
				auxContinua = continuar(continua);
				finalizaJogo(auxContinua, pontos);
			} else {
				auxContinua = 1;
				System.out.println("Voce errou!!");
				finalizaJogo(auxContinua, pontos);
			}
			break;

		case 2:

			System.out.println("Nome do personagem principal de DBZ?");
			respostaCorreta = "Goku";
			resposta = sc.nextLine();

			if (resposta.equals(respostaCorreta)) {
				acertou(pontos);
				System.out.println("Deseja continuar? (s) ou n");
				continua = sc.nextLine();
				auxContinua = continuar(continua);
				finalizaJogo(auxContinua, pontos);
			} else {
				auxContinua = 1;
				System.out.println("Voce errou!!");
				finalizaJogo(auxContinua, pontos);
			}
			break;
		
		case 3:
			
			System.out.println("Nome da Raposa de 9 caldas?");
			respostaCorreta = "Kurama";
			resposta = sc.nextLine();

			if (resposta.equals(respostaCorreta)) {
				acertou(pontos);
				System.out.println("Deseja continuar? (s) ou n");
				continua = sc.nextLine();
				auxContinua = continuar(continua);
				finalizaJogo(auxContinua, pontos);
			} else {
				auxContinua = 1;
				System.out.println("Voce errou!!");
				finalizaJogo(auxContinua, pontos);
			}
			break;

		case 4:

			System.out.println("Nome do Pokemon mais conhecido do anime Pokemon?");
			respostaCorreta = "Picachu";
			resposta = sc.nextLine();

			if (resposta.equals(respostaCorreta)) {
				acertou(pontos);
				System.out.println("Deseja continuar? (s) ou n");
				continua = sc.nextLine();
				auxContinua = continuar(continua);
				finalizaJogo(auxContinua, pontos);
			} else {
				auxContinua = 1;
				System.out.println("Voce errou!!");
				finalizaJogo(auxContinua, pontos);
			}
			break;

		case 5:
			System.out.println("Qual o maior animal marinho da Terra?");
			respostaCorreta = "Baleia";
			resposta = sc.nextLine();

			if (resposta.equals(respostaCorreta)) {
				acertou(pontos);
				System.out.println("Deseja continuar? (s) ou n");
				continua = sc.nextLine();
				auxContinua = continuar(continua);
				finalizaJogo(auxContinua, pontos);
			} else {
				auxContinua = 1;
				System.out.println("Voce errou!!");
				finalizaJogo(auxContinua, pontos);
			}
			break;

		case 6:
			System.out.println("Qual o nome do super gato?");
			respostaCorreta = "Rajado";
			resposta = sc.nextLine();

			if (resposta.equals(respostaCorreta)) {
				acertou(pontos);				
				System.out.println("Deseja continuar? (s) ou n");
				continua = sc.nextLine();
				auxContinua = continuar(continua);
				finalizaJogo(auxContinua, pontos);
			} else {
				auxContinua = 1;
				System.out.println("Voce errou!!");
				finalizaJogo(auxContinua, pontos);
			}
			break;

		default:
			auxContinua = 1;
			finalizaJogo(auxContinua, pontos);
		}
	}
}
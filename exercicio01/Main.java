/*
 * ESTE EXERCICIO FOI REALIZADO SOMENTE PARA TRABALHAR COM A CRIAÇÃO DE UM ARRAY,
 * ONDE FIZEMOS A IMPRESSÃO DO MESMO, IDENTIFICAMOS QUANTOS CARACTERES FORAM PREENCHIDOS,
 * E TAMBÉM PASSAMOS OS CARACTERES DO ARRAY PARA DENTRO DE UM STRING.
 */

package exercicio01;

public class Main {
	
	public char[] nome = {'V','i','n','i','c','i','u','s'};
	String nomeCompleto = "";
	int aux;
	
	public Main() {
		System.out.println("Impressao do array:");
		for(int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
			nomeCompleto = nomeCompleto+nome[i];
			aux = i;
		}
		
		aux++; //INCREMENTEI UM NO VALOR DE AUX, POIS TEMOS QUE SOMAR TAMBÉM O CARACTER QUE ESTÁ ARMAZENADO NO ESPAÇO 0
		
		System.out.println("\nNome completo = " + nomeCompleto);
		System.out.println("Quantidade de caracteres = " + aux);
	}
	
	public static void main(String args[]) {
		new Main();
	}
}
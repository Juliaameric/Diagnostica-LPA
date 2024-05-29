package diagnostica;

import java.util.Scanner;

public class Carros {

	public static void main(String[] args) {//pode ser acessado por qualquer classe dentro (e fora) do projeto
		
		Scanner ler = new Scanner (System.in); //simplifica a leitura de diversas formas de entrada do usuário
		
		String garagem[] = new String[7];// identificar uma sequência de variavel
		
		
		
		for (int i=1; i <= 6 ; i++) {// estrutura de repetiçao: permitem executar mais de uma vez um mesmo trecho de código
			
			System.out.println("informe a marca do carro:");// Esta declarando, armazenando para mostrar na tela
			
			garagem[i]=ler.next();//iniciando a variavel 
			
		}
		for (int i=1; i <= 6 ; i++) {// estrutura de repetiçao: permitem executar mais de uma vez um mesmo trecho de código
			System.out.println("O carro que está na vaga: "+ i + " é :" + garagem[i]);
			// System: ele mostra o que declaramos entre os parenteses
			
		}
		ler.close();// encerrar o codigo
	}

}

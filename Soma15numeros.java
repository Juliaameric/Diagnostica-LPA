package diagnostica;

import java.util.Scanner;

public class Soma15numeros {//entrada

	public static void main(String[] args) { //pode ser acessado por qualquer classe dentro (e fora) do projeto
		
		Scanner ler = new Scanner (System.in); //simplifica a leitura de diversas formas de entrada do usuário
		
		int numero, soma =0;// declaraçao de variavel
		
		//int:ela controla a execução direcionando as chamadas para outras funções no programa, int " inteiro"
		
		
		for (int i=0; i <= 15 ; i++) { // estrutura de repetiçao: permitem executar mais de uma vez um mesmo trecho de código
			
			System.out.println("Informe um numero inteiro"); // Esta declarando, armazenando para mostrar na tela
			
			numero= ler.nextInt();//Guarda o valor que foi colocado na variavel
		
			soma = soma + numero ;// faz a soma das variaveis e armazena para o system
		}
		
		System.out.println("A soma dos numero é: "+soma);// mostra o trabalho final e o resultado na tela final
		
	}

}//saida

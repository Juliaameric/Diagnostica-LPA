package diagnostica;

import java.util.Scanner;

public class Rscreever {

	public static void main(String[] args) {//pode ser acessado por qualquer classe dentro (e fora) do projeto
		Scanner ler = new Scanner (System.in);
		// O scanner é usado para validar o que escrevemos e permitir a leitura das variaveis,
		//simplifica a leitura de diversas formas de entrada do usuário
		
		int dia;
		// int: inteiro, so é usado em palavras
		
		System.out.println("informe o dia da semana (1-7)");// Esta declarando, armazenando para mostrar na tela
		
		dia = ler.nextInt();
		//guarda oque foi escrito para declarar
		
		switch (dia) { // abrir uma "aba" para armazenar
		
		//switch: se refere a variavel que foi declarada pelo int
		
		
		case (1) : // : serve para declarar oque esta nos ()
			
			//case: usamos como um sinonimo de opção, para executar as intruçoes do usuario	
			
			System.out.println("é domingo");// Armazena a frase entre () para mostrar ao usuario na tela FINAL
		
		break;// termina a execução do switch, no caso ele fecha o primeiro caso
		
		case(2) : // : serve para declarar oque esta nos ()
			
			//case: usamos como um sinonimo de opção, para executar as intruçoes do usuario	
			
			System.out.println("é segunda");// Armazena a frase entre () para mostrar ao usuario na tela FINAL
		
		break;// termina a execução do switch, no caso ele fecha o caso
		
		case (3) :// : serve para declarar oque esta nos ()
			
			//case: usamos como um sinonimo de opção, para executar as intruçoes do usuario
			
			System.out.println("é terça");	// Armazena a frase entre () para mostrar ao usuario na tela FINAL
		
		break;// termina a execução do switch, no caso ele fecha o caso
		
		case (4) :// : serve para declarar oque esta nos ()
			
			//case: usamos como um sinonimo de opção, para executar as intruçoes do usuario	
			
			System.out.println("é quarta");	// Armazena a frase entre () para mostrar ao usuario na tela FINAL
		
		break;// termina a execução do switch, no caso ele fecha o caso
		
		case (5) :// : serve para declarar oque esta nos ()
			
			//case: usamos como um sinonimo de opção, para executar as intruçoes do usuario	
			
			System.out.println("é quinta");// Armazena a frase entre () para mostrar ao usuario na tela FINAL
		
		break;// termina a execução do switch, no caso ele fecha o caso
		
		case (6) :// : serve para declarar oque esta nos ()
			
			//case: usamos como um sinonimo de opção, para executar as intruçoes do usuario	
			
			System.out.println("é sexta");// Armazena a frase entre () para mostrar ao usuario na tela FINAL
		
		break;// termina a execução do switch, no caso ele fecha o caso
		
		case(7) :// : serve para declarar oque esta nos ()
			
			//case: usamos como um sinonimo de opção, para executar as intruçoes do usuario	
			
			System.out.println("é sabado");// Armazena a frase entre () para mostrar ao usuario na tela FINAL
		
		break;// termina a execução do switch, no caso ele fecha o caso
		
		default: // exibe uma mensagem, mostrando uma falsa
			
			System.out.println("dia invalido");// Armazena a frase entre () para mostrar ao usuario na tela FINAL
	
	} //saida
	
}

	}



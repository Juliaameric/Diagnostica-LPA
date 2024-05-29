package diagnostica;

import java.util.Scanner;

public class Converterfluxo {

	public static void main(String[] args) { //pode ser acessado por qualquer classe dentro (e fora) do projeto
		Scanner ler = new Scanner (System.in);
		// O scanner é usado para validar o que escrevemos e permitir a leitura das variaveis
		//simplifica a leitura de diversas formas de entrada do usuário
		
		Double a, b, soma, subtr, mult, div; // Declarando as variaveis
		// Double é um tipo real
		
		System.out.println(" insira o numero: "); // System: ele mostra o que declaramos entre os parenteses
		a= ler.nextDouble();
		// Aqui validamos e damos uma chance do usuario escrever seu numero
		
		System.out.println(" insira o numero: "); // System: ele mostra o que declaramos entre os parenteses
		
		b= ler.nextDouble();
		// Aqui validamos e damos uma chance do usuario escrever seu numero
		
		soma= a+b;
		// Mostra a soma das variaveis
		subtr= a-b;
		// Mostra a subtraçao das variaveis
		mult= a*b;
		// Mostra a multiplicaçao das variaveis
		div= a/b;
		// Mostra a divisao das variaveis
		
		System.out.println("a soma dos numero é: "+soma);
		// Mostra o resultado da soma 
		System.out.println("a subtr dos numero é: "+subtr);
		// Mostra o resultado da subtraçao
		System.out.println("a multi dos numero é: "+mult);
		// Mostra o resultado da multiplicaçao
		System.out.println("a div dos numero é: "+div);
		// Mostra o resultado da divisao
		
	}

}

package diagnostica;

import java.util.Scanner;

public class Calculearea {

	public static void main(String[] args) {//pode ser acessado por qualquer classe dentro (e fora) do projeto
		Scanner ler = new Scanner (System.in);
		// O scanner é usado para validar o que escrevemos e permitir a leitura das variaveis
		//simplifica a leitura de diversas formas de entrada do usuário
		
		Double altura,area,base; // Declarando as variaveis 
		// Double é um tipo real
		
		System.out.println("informe o valor da altura: "); // Mostra o que declaramosna tela
		altura= ler.nextDouble();
		//Guarda o valor que foi colocado na variavel
		
		System.out.println("informe o valor da base: ");// Mostra o que declaramosna tela
		base= ler.nextDouble();
		//Guarda o valor que foi colocado na variavel
		
		area= base*altura/2; //Faz a multiplicaçao entre as variaveis
		
		System.out.println("a area da base é: "+area);
		// Mostra o resultado final 
	}

}

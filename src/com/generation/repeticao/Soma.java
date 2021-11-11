package com.generation.repeticao;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Coloque algum número inteiro, "
							+ "o programa irá parar quando colocar 0 ");
		int numero = entrada.nextInt();
		int soma = numero;
		
		do {
			numero = entrada.nextInt();
			soma += numero;
		}while(numero != 0); 
		
		System.out.println("A soma dos números inseridos é " + soma);
		
		entrada.close();

	}

}

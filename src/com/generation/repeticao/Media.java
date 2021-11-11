package com.generation.repeticao;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Coloque números inteiros,"
				           + " o programa irá parar quando colocar 0 ");
		int numero = entrada.nextInt();
		int soma = 0;
		int divisor = 0;

		do {
			numero = entrada.nextInt();
			if(numero % 3 == 0) {
				soma += numero;
				divisor++;
			}
		} while (numero != 0);

		System.out.println("A a média dos números,"
				           + " mutiplos de 3, inseridos é " + soma/(divisor-1));

		entrada.close();

	}

}

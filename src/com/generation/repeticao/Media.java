package com.generation.repeticao;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Coloque n�meros inteiros,"
				           + " o programa ir� parar quando colocar 0 ");
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

		System.out.println("A a m�dia dos n�meros,"
				           + " mutiplos de 3, inseridos � " + soma/(divisor-1));

		entrada.close();

	}

}

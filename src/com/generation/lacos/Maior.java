package com.generation.lacos;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira tr�s n�meros inteiros e lhe direi qual � o maior");
		System.out.println("N�mero 1: ");
		int n1 = entrada.nextInt();
		System.out.println("N�mero 2: ");
		int n2 = entrada.nextInt();
		System.out.println("N�mero 3: ");
		int n3 = entrada.nextInt();
		
		int maior = n1;
		
		if(n2 > maior) {
			maior = n2;
		}
		if(n3 > maior || n3 > n2) {
			maior = n3;
		}
		
		System.out.println("O maior n�mero digitado foi " + maior);

		entrada.close();
		
	}

}

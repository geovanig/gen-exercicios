package com.generation.lacos;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro ");
		int numero = leitor.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � um n�mero par e a raiz quadrada dele � " + Math.sqrt(numero));
		}else {
			System.out.println(numero + " � impar, e ele fica " + Math.pow(numero, 2) + ", elevado ao quadrado");
		}
		
		leitor.close();

	}

}

package com.generation.lacos;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro ");
		int numero = leitor.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " é um número par e a raiz quadrada dele é " + Math.sqrt(numero));
		}else {
			System.out.println(numero + " é impar, e ele fica " + Math.pow(numero, 2) + ", elevado ao quadrado");
		}
		
		leitor.close();

	}

}

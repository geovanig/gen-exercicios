package com.generation.repeticao;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira 10 números inteiros...");
		
		int par = 0, impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(i + "° número: ");
			int numero = entrada.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
		}
		
		System.out.println("Calculando...");
		Thread.sleep(500);
		
		System.out.println("Dos seus 10 números, " + par + " são pares e " + impar + " são impares");
		
		entrada.close();
		
	}

}

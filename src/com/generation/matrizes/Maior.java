package com.generation.matrizes;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] pontos = new int[5];
		
		int maior = 0;
		
		for (int ponto = 0; ponto < pontos.length; ponto++) {
			
			System.out.println("Insira o " + (ponto+1) + "° ponto ");
			pontos[ponto] = entrada.nextInt();
			
			if(pontos[ponto] > maior) {
				maior = pontos[ponto];
			}
			
		}
		
		System.out.println("");
		for (int ponto = 0; ponto < pontos.length; ponto++) {
			System.out.println("Na posição " + (ponto + 1) + " temos " + pontos[ponto]);
		}
		
		System.out.println("");
		System.out.println("A maior pontuação entres eles é " + maior);
		
		entrada.close();
	}

}

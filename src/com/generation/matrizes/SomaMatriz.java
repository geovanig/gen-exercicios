package com.generation.matrizes;

import java.util.Scanner;

public class SomaMatriz {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int valores[][] = new int[3][3];
		int soma = 0, somaDiagonal = 0;
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.println("Insira um valor ");
				valores[i][j] = leitor.nextInt(); 
				soma += valores[i][j];
				
				if(i == j ) {
					somaDiagonal += valores[i][j];
				}
			}
		}
		
		
		System.out.println("");
		System.out.println("A soma da Matriz é " + soma);
		System.out.println("A soma da Diagonal é " + somaDiagonal);
		
		leitor.close();

	}

}

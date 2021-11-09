package com.generation;

//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Coloque as três notas aqui");
		System.out.println("'-'-'-'-'-'-'-'-'-'-'-'-'-'-");
		System.out.println("Nota 1: ");
		int n1 = entrada.nextInt();
		System.out.println("Nota 2: ");
		int n2 = entrada.nextInt();
		System.out.println("Nota 3: ");
		int n3 = entrada.nextInt();
		
		System.out.println("Média: " + (n1+n2+n3) / 3);
		
		entrada.close();

	}

}

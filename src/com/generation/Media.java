package com.generation;

//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Coloque as tr�s notas aqui");
		System.out.println("'-'-'-'-'-'-'-'-'-'-'-'-'-'-");
		System.out.println("Nota 1: ");
		int n1 = entrada.nextInt();
		System.out.println("Nota 2: ");
		int n2 = entrada.nextInt();
		System.out.println("Nota 3: ");
		int n3 = entrada.nextInt();
		
		System.out.println("M�dia: " + (n1+n2+n3) / 3);
		
		entrada.close();

	}

}

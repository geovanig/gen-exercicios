package com.generation.lacos;

import java.util.Scanner;

public class Ordenados {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("-'-'-'-'-'-'-'-'-'-'-'-'-'-'-'-'");
		System.out.println("Entre com três números inteiros");
		System.out.println("-'-'-'-'-'-'-'-'-'-'-'-'-'-'-'-'");
		System.out.println("");
		System.out.println("Número 1: ");
		int n1 = leitor.nextInt();
		System.out.println("Número 2: ");
		int n2 = leitor.nextInt();
		System.out.println("Número 3: ");
		int n3 = leitor.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A 1º ordem crescente: \n" + n1 + "|" + n2 + "|"+ n3);
		}
		else if(n1 <= n3 && n3 <= n2) {
			System.out.println("A 2º ordem crescente: \n" + n1 + "|" + n3 + "|" + n2);
		}
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("A 3º ordem crescente: \n" + n2 + "|" + n1 + "|" + n3);
		}
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A 4º ordem crescente: \n" + n2 + "|" + n3 + "|" + n1);
		}
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("A 5º ordem crescente: \n" + n3 + "|" + n1 + "|" + n2);
		}
		else {
			System.out.println("A 6º ordem crescente: \n" + n3 + "|" + n2 + "|" + n1);
		}
		
		leitor.close();

	}

}

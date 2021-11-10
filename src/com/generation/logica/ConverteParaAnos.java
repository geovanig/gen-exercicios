package com.generation.logica;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias 
//e mostre-a expressa em anos, meses e dias. 

import java.util.Scanner;

public class ConverteParaAnos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Me diga quantos dias de vida tem e direi quantos anos possui...");
		int idade = entrada.nextInt();
		
		int anos = idade / 365;
		int meses = (idade % 365) / 30;
		int dias = (idade % 365) % 30;
		
		System.out.println("Você possui "
							+anos
							+ " anos, "
							+ meses
							+ " meses e "
							+ dias
							+" dias de vida");
	
		entrada.close();
		
	}
	
}

package com.generation.lacos;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem? ");
		int idade = entrada.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Você se enquadra na categoria infantil!");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua idade está na categoria juvenil");
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("Você já pode competir como adulto");
		}else {
			System.out.println("Infelizmente, não existe categoria para sua idade...");
		}
		
		entrada.close();

	}

}

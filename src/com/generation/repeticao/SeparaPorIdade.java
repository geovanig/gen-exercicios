package com.generation.repeticao;

import java.util.Scanner;

public class SeparaPorIdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite uma idade");
		int idade = entrada.nextInt();
		
		int menor21 = 0, maior50 = 0;
		
		while(idade != -99) {
			
			idade = entrada.nextInt();
			
			if(idade < 21) {
				menor21++;
			}else if(idade >50) {
				maior50++;
			}
			
		}
		
		System.out.println("Nessa lista temos "
							+ menor21
							+ " pessoas com menos de 21 anos e "
							+ maior50
							+ " com mais de 50 anos");
							
		entrada.close();		

	}

}

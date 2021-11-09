package com.generation;

import java.util.Scanner;

//4. Escreva  um sistema que leia três números
//inteiros e positivos (A, B, C) e calcule a seguinte expressão: 

public class ABC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Escreva o valor de A: ");
		a = entrada.nextInt();
		
		System.out.println("Escreva o valor de B: ");
		b = entrada.nextInt();
		
		System.out.println("Escreva o valor de C: ");
		c = entrada.nextInt();
		
		System.out.println("");
		
		r=(a+b)*(a*b);
		s=(b+c)*(b+c);
		d = (r + s) / 2;
		
		System.out.println("Resultado deu " + d);
		
		entrada.close();

	}

}

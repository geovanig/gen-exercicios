package com.generation.logica;
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
//meses e dias e mostre-a expressa apenas em dias. 

import java.util.Scanner;

public class ConverteIdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Coloque, aqui, quantos anos você tem: ");
		int anos = entrada.nextInt();
		
		System.out.println("Coloque, aqui, quantos meses você possui, depois do seu aniversário: ");
		int meses = entrada.nextInt();
		
		System.out.println("Coloque, aqui, quantos dias você tem, depois da quantidade de meses completos: ");
		int dias = entrada.nextInt();
		
		int diasVividos = (anos*365) + (meses*30) + dias;
		
		System.out.println("Você viveu o total de " + diasVividos + " dias");
		
		entrada.close();

	}

}

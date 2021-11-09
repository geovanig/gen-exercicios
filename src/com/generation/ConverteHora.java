package com.generation;

import java.util.Scanner;

//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

public class ConverteHora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Me diga quantos segundos, no total, irá durar o evento ");
		int tempo = entrada.nextInt();

		int horas = tempo / 3600;
		int minutos = (tempo % 3600) / 60;
		int segundos = (tempo % 3600) % 60;

		System.out.println("O evento durará " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");

		entrada.close();

	}

}

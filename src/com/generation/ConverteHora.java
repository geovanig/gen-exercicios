package com.generation;

import java.util.Scanner;

//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

public class ConverteHora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Me diga quantos segundos, no total, ir� durar o evento ");
		int tempo = entrada.nextInt();

		int horas = tempo / 3600;
		int minutos = (tempo % 3600) / 60;
		int segundos = (tempo % 3600) % 60;

		System.out.println("O evento durar� " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");

		entrada.close();

	}

}

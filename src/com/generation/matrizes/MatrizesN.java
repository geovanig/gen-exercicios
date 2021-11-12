package com.generation.matrizes;

import java.util.Scanner;

public class MatrizesN {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double[][] n1 = new double[4][6];
		double[][] n2 = new double[4][6];
		double[][] m1 = new double[4][6];
		double[][] m2 = new double[4][6];

		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {

				System.out.println("Insira o valor de N1[" + lin + "][" + col + "]: ");
				n1[lin][col] = leitor.nextDouble();
				System.out.println("Insira o valor de N2[" + lin + "][" + col + "]: ");
				n2[lin][col] = leitor.nextDouble();

				m1[lin][col] = n1[lin][col] + n2[lin][col];
				m2[lin][col] = n1[lin][col] - n2[lin][col];
			}

		}

		System.out.println("Valores de m1: \n");
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 4; col++) {
				System.out.println(" " + m1[lin][col]);
			}
		}

		System.out.println("Valores de m2: \n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(" " + m2[i][j]);
			}
		}

		leitor.close();
	}

}

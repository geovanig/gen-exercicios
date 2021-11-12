package com.generation.matrizes;

public class LancaDado {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Irei lançar um dado 6 vezes, se prepare!");
		
		Thread.sleep(2000);
		
		int numerosDado[]= new int[6];
		int maiorLancamento = 0, ocorrenciaMaior = 0;
		
		for (int i = 0; i < 6; i++) {
			Thread.sleep(1500);
			System.out.println("Lançando dado...");
			numerosDado[i] = (int) (Math.random()*(7-1))+1;
			Thread.sleep(800);
			System.out.println("Nesse lançamento caiu o número " + numerosDado[i]);
			
			if(numerosDado[i] >= maiorLancamento) {
				maiorLancamento = numerosDado[i];	
				ocorrenciaMaior++;
				if(numerosDado[i] <= maiorLancamento) {
					ocorrenciaMaior--;
				}
			
			}
			
		}

		System.out.println("O maior número que você conseguiu, do dado foi o "
							+ maiorLancamento
							+ " e ele caiu "
							+ (ocorrenciaMaior + 1)
							+ " vezes");
		
	}

}

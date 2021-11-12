package poo.aviao;

public class AviaoRun {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.alturaLimite = 1234.4;
		aviao.numeracao = 3212;
		aviao.tipo = "Jumbo";
		
		System.out.println("O avião " + aviao.tipo
							+ " sobe até "
							+ aviao.alturaLimite
							+ " pés!");

	}

}

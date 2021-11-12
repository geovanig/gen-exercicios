package poo.cliente;

public class ClienteRun {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();

		cliente1.nome = "Lion Fernades";
		cliente1.cadastro = 123;

		Cliente cliente2 = new Cliente();

		cliente2.nome = "Ma Ferreira";
		cliente2.cadastro = 321;

		System.out.println("O número de cadastro de "
							+ cliente1.nome
							+ " é "
							+ cliente1.cadastro );
		
	}

}

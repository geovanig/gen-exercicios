package poo.cliente;

public class ClienteRun {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();

		cliente1.nome = "Lion Fernades";
		cliente1.cadastro = 123;

		Cliente cliente2 = new Cliente();

		cliente2.nome = "Ma Ferreira";
		cliente2.cadastro = 321;

		System.out.println("O n�mero de cadastro de "
							+ cliente1.nome
							+ " � "
							+ cliente1.cadastro );
		
	}

}

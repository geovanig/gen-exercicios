package poo.funcionario;

public class FuncionarioRun {

	public static void main(String[] args) {
		
		Funcionario trabalhador = new Funcionario("Gleidson", 1232, "Auxiliar de Estagi�rio", 600);

		System.out.println("Nosso funcionario, " + trabalhador.getNome() + " \nganha R$"
				+ trabalhador.getSalario() + ", ele est� na nossa empresa como " + trabalhador.getCargo()
				+ " \ne seu n�mero de registro � " + trabalhador.getRegistro());
		
		System.out.println("");
		trabalhador.reclamar();
	}

}

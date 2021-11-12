package poo.funcionario;

public class FuncionarioRun {

	public static void main(String[] args) {
		
		Funcionario trabalhador = new Funcionario("Gleidson", 1232, "Auxiliar de Estagiário", 600);

		System.out.println("Nosso funcionario, " + trabalhador.getNome() + " \nganha R$"
				+ trabalhador.getSalario() + ", ele está na nossa empresa como " + trabalhador.getCargo()
				+ " \ne seu número de registro é " + trabalhador.getRegistro());
		
		System.out.println("");
		trabalhador.reclamar();
	}

}

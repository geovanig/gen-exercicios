package poo.funcionario;

public class Funcionario {

	private String nome;
	private int registro;
	private String cargo;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, int registro, String cargo, double salario) {
		this.nome = nome;
		this.registro = registro;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public int getRegistro() {
		return registro;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
	public void reclamar() {
		System.out.println("Não ganho pra isso...");
	}
	
}

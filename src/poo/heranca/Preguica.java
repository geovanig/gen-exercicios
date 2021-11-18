package poo.heranca;

public class Preguica extends Animal {

	private String nome;
	private int idade;
	
	public Preguica(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	void emitirSom() {
		System.out.println("Som de preguiça...");
	}	
	
}

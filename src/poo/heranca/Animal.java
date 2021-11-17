package poo.heranca;

public class Animal {

	private String nome;
	private int idade;
	
	Animal(){}

	public Animal(String nome, int idade) {
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
	
	void emitirSom() {}
	
	void correr(){}
	
}

package poo.eletronico;

public class ProdutoEletronico {
	
	private String nome;
	private double valor;
	
	public double desconto(double valorDesconto) {
		valorDesconto = (this.valor /100) * valorDesconto;
		return this.valor - valorDesconto;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}

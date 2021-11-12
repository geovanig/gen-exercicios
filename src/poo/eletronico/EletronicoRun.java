package poo.eletronico;

public class EletronicoRun {

	public static void main(String[] args) {
		
		ProdutoEletronico produto = new ProdutoEletronico();
		
		produto.setNome("Notebook");
		produto.setValor(3000);
		
		System.out.println("O " + produto.getNome() + " custa R$"
		+ produto.getValor()+ ", com desconto " + produto.desconto(5));

	}

}

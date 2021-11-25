package poo.listas.loja;

public class Loja extends Estoque {

	public static void main(String[] args) {
		
		Estoque itens = new Estoque("Batata", 3);
		
		itens.adicionarItem();
		
		itens.exibirItens();
		
		itens.removerItem();
		
		itens.exibirItens();
		

	}

}

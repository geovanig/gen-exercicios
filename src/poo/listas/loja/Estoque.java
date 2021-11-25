package poo.listas.loja;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Estoque {

	private String item;
	private double valor;
	
	
	
	Estoque(){}
	Estoque(String item, double valor){
		this.item = item;
		this.valor = valor;
	}
	
	ArrayList<Estoque> listaItens = new ArrayList<>();
	
	Scanner leitor = new Scanner(System.in);
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void exibirItens() {
		for (int i = 0; i < listaItens.size(); i++) {
			System.out.println(listaItens.get(i));
		}
	}
	
	public void adicionarItem() {
		System.out.println("Qual seria o item que você gostaria de adicionar? ");
		String intem = leitor.nextLine();
		System.out.println("Qual seu valor? ");
		double valor = leitor.nextDouble();
		listaItens.add(new Estoque(intem, valor));
	}
	
	public void removerItem() {
		String item = leitor.nextLine();
		listaItens.remove(0);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(item, leitor, listaItens, valor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		return Objects.equals(item, other.item) && Objects.equals(leitor, other.leitor)
				&& Objects.equals(listaItens, other.listaItens)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	@Override
	public String toString() {
		return item + " - R$" + valor;
	}

}

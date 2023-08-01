package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.itens.add(new Item("Caneta", 20, 1.5));
		compra1.itens.add(new Item("Borracha", 10, 1.99));
		compra1.itens.add(new Item("Caderno", 3, 24.99));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}
}

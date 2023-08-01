package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta", 1.99);
		Produto p2 = new Produto("Caderno", 24.99);
		Produto p3 = new Produto("Estojo", 15.49);
		
		Compra c1 = new Compra();
		Compra c2 = new Compra();
		
		c1.adicionarItens(3, p1);
		c1.adicionarItens(2, p2);
		c1.adicionarItens(1, p3);
		
		c2.adicionarItens(3, p1);
		c2.adicionarItens(1, p3);
		
		Cliente cliente1 = new Cliente("Marcelo");
		
		cliente1.adicionarCompras(c1);
		cliente1.adicionarCompras(c2);
		
		cliente1.imprimirConta();
	}
}

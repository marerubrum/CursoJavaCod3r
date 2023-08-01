package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();

	void adicionarItens(int quantidade, Produto produto) {
		this.itens.add(new Item(quantidade, produto));
	}

	double obterValorParcial() {
		double resultado = 0.0;
		
		for (Item item : this.itens) {
			resultado += item.quantidade * item.produto.preco;
		}
		return resultado;
	}
}

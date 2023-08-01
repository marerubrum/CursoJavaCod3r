package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompras(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double resultado = 0.0;
		for(Compra compra: compras) {
			resultado += compra.obterValorParcial();
		}
		return resultado;
	}
	
	void imprimirConta() {
		System.out.println(this.nome 
				+ " deve pagar " 
				+ this.obterValorTotal() 
				+ " reais.");
	}
}

package oo.herança.testes;

import oo.herança.desafio.Civic;
import oo.herança.desafio.Ferrari;

public class CarrosTeste {

	public static void main(String[] args) {
		
		//classe carro, mais duas classes de carros específicos - ok
		//Colocar na classe genérica velocidade atual e métodos acelerar e frear ok
		//Dentro da classe Ferrari acelerar de 15 em 15 ok
		//Classe teste ok
		
		Civic c1 = new Civic();
		Ferrari f1 = new Ferrari();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		f1.ligarTurbo();
		f1.acelerar();
		f1.desligarTurbo();
		f1.acelerar();
		f1.ligarAr();
		f1.acelerar();
		
		System.out.println("A velocidade do Civic é: "
		+ c1.velocidadeAtual + " Km/h.");
		System.out.println("A velocidade da Ferrari é: "
				+ f1.velocidadeAtual + " Km/h.");
		
		c1.frear();
		f1.frear();
		
		System.out.println("A velocidade do Civic é: "
				+ c1.velocidadeAtual + " Km/h.");
		System.out.println("A velocidade da Ferrari é: "
				+ f1.velocidadeAtual + " Km/h.");
	}
}

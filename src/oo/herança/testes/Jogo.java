package oo.herança.testes;

import oo.herança.Direcao;
import oo.herança.Heroi;
import oo.herança.Jogador;
import oo.herança.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador monstro = new Monstro();
		
		monstro.x = 10;
		monstro.y = 10;
		
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);
		
		System.out.println(monstro.x + " " + monstro.y);
	
		Jogador heroi = new Heroi(10, 11);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	}
}

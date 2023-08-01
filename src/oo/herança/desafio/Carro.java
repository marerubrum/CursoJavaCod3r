package oo.herança.desafio;

public class Carro {

	protected final int velocidadeMaxima;
	public double velocidadeAtual = 0;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public boolean acelerar() {
		if (velocidadeAtual + getDelta() > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
			return true;
		} else {
			velocidadeAtual += getDelta();
			return true;
		}
	}

	public boolean frear() {
		if (velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
			return true;
		} else if (velocidadeAtual > 0) {
			velocidadeAtual = 0;
			return true;
		} else
			return false;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}

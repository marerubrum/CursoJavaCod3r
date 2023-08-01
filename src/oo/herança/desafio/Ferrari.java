package oo.herança.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari() {
		super(315);
		setDelta(15);
	}
	
	public Ferrari (int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
}

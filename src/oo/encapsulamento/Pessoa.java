package oo.encapsulamento;

public class Pessoa {

	private int idade;
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
//	Getter
	public int getIdade() {
		return idade;
	}
	
//	Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0) {
			this.idade = novaIdade;
		} else {
			System.out.println("Idade inválida");
		}
	}
}

package classesEMetodos.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	double comer (Comida comida) {
		
		return peso += comida.pesoDaComida;
		
	}
	
	void imprimir (Pessoa pessoa, Comida comida) {
		System.out.printf("%s tem %.3f kg. Após comer %s com %.3f kg, agora pesa %.3f\n",
				pessoa.nome, pessoa.peso, comida.nomeDaComida, comida.pesoDaComida, pessoa.comer(comida));
	}
	
	Pessoa (String nome, double peso){
		
		this.nome = nome;
		this.peso = peso;		
	}
}

package classesEMetodos.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		// Somar o peso da comida com o da pessoa
		// Comida feijão, arroz e carne
		// Fazer 2 pessoas
		// Mostrar o nome e o peso antes e depois
		
		Comida c1 = new Comida("Arroz", 0.255);
		Comida c2 = new Comida("Feijão", 0.300);
		Comida c3 = new Comida("Carne", 0.150);
		
		Pessoa p1 = new Pessoa("Pedro", 60.0);
		Pessoa p2 = new Pessoa("Marcos", 85.5);
		
		p1.imprimir(p1, c1);
		p1.imprimir(p1, c2);
		p1.imprimir(p1, c3);
		
		p2.imprimir(p2, c1);
		p2.imprimir(p2, c2);
		p2.imprimir(p2, c3);		
	}
}

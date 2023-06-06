package classesEMetodos.classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto(double descontoExtra) {
		return preco * (1 - desconto - descontoExtra);
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}

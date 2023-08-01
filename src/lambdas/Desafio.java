package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3835.89, 0.15);
		
		Function<Produto, Double> precoFinal =
				produto -> (produto.preco * (1 - produto.desconto));
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? (preco * (1 + 0.085)) : preco;
		UnaryOperator<Double> frete =
				preco -> preco >= 3000.0 ? (preco + 100.0) : (preco + 50.0); 
		UnaryOperator<Double> arredondar =
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar =
				preco -> ("R$" + preco).replace(".", ",");
		
		String resultado = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(resultado);
	}
}

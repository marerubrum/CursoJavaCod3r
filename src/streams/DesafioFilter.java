package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Processador p1 = new Processador("Intel", "Core i3", "13100f");
		Processador p2 = new Processador("Intel", "Core i5", "13600k");
		Processador p3 = new Processador("Intel", "Core i7", "13700k");
		Processador p4 = new Processador("Amd", "Ryzen 5", "5500");
		Processador p5 = new Processador("Amd", "Ryzen 5", "5600x");
		Processador p6 = new Processador("Amd", "Ryzen 7", "5800x");
		
		List<Processador> processadores =
				Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Processador> isAmd =
				p -> p.fabricante.equalsIgnoreCase("Amd");
//		Predicate<Processador> isIntel =
//				p -> p.fabricante.equalsIgnoreCase("Intel");
		Predicate<Processador> modelo =
				p -> p.modelo.equalsIgnoreCase("Ryzen 5");
		Function<Processador, String> opcoes =
				p -> String.format("Processador disponível: %s %s %s.\n", p.fabricante, p.modelo, p.serie);
				
		processadores.stream()
		.filter(isAmd)
		.filter(modelo)
		.map(opcoes)
		.forEach(System.out::print);
	}
}

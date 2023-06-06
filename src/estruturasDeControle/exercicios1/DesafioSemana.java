package estruturasDeControle.exercicios1;

import java.util.Scanner;

public class DesafioSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escreva um dia de semana: ");
		String dia = entrada.next();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.printf("%s equivale a 1\n", dia);
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.printf("%s equivale a 2\n", dia);
		} else if (dia.equalsIgnoreCase("terça")
				|| dia.equalsIgnoreCase("terca")) {
			System.out.printf("%s equivale a 3\n", dia);
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.printf("%s equivale a 4\n", dia);
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.printf("%s equivale a 5\n", dia);
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.printf("%s equivale a 6\n", dia);
		} else if (dia.equalsIgnoreCase("sábado")
				|| dia.equalsIgnoreCase("sabado")) {
			System.out.printf("%s equivale a 7\n", dia);
		} else 
			System.out.println("Dia inválido");
		
		System.out.println("Fim!");
		entrada.close();
	}
}

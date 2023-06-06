package estruturasDeControle.exercicios1;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean i = true;

		while (i) {

			System.out.println("Informa a média: ");
			double media = entrada.nextDouble();

			if (media <= 10.0 && media >= 7.0) {
				System.out.println("Aprovado");
				System.out.println("Parabéns!");
				i = false;
			} else if (media < 7 && media >= 4.5) {
				System.out.println("Em recuperação");
				i = false;
			} else if (media < 4.5 && media >= 0) {
				System.out.println("Reprovado");
				i = false;
			} else
				System.out.println("Digite uma média válida");
		}
		entrada.close();
	}
}

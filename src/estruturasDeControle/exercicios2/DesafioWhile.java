package estruturasDeControle.exercicios2;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String nota = "";
		
		double total = 0;
		int contador = 0;
		
		while(!nota.equalsIgnoreCase("-1")) {
			
			System.out.println("Digite uma nota (ou -1 para sair) ");
			nota = entrada.next().replace(",", ".");
			
			if(Double.parseDouble(nota) >= 0 && Double.parseDouble(nota) <= 10) {
				
				total += Double.parseDouble(nota);
				contador++;
			
			} else if (!nota.equalsIgnoreCase("-1")){
				System.out.println("Digite uma nota válida");
			}
			
		}
		
		System.out.println("O total é: " + total);
		
		double media = total / contador;
		
		System.out.println("A média da turma é: " + media);

		System.out.println("Fim!");
		
		entrada.close();
	}
}

package arraysExercicios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		//Receber a quantidade de notas
		//Ler cada nota
		//Armazenar as notas
		//Calcular a média
		//Usar dois laços for
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidade = 0;
		
		System.out.println("Digite a quantidade de notas a serem registradas");
		quantidade = entrada.nextInt();
		
		double[] notas = new double[quantidade];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota: nº %d: ", (i + 1));
			notas[i] = entrada.nextDouble();
		}
		
		double soma = 0;
		
		for (double nota : notas) {
			soma += nota;
		}
		
		double media = soma / notas.length;
		
		System.out.println("A média é: " + media);
		
		entrada.close();
	}
}

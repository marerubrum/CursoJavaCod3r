package fundamentos.exercicio1;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("bom ");
		System.out.print("dia\n");
		
		System.out.println("bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f\n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
//		System.out.println("\nNome: " + nome + ", idade: " + idade);
		System.out.printf("%s tem %d anos",
				nome, idade);
		
		entrada.close();
	}
}

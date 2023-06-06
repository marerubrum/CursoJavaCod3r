package fundamentos.exercicios3;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de a, b e c respectivamente");
		
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		System.out.printf("\nSua equação é: %.2fx² + %.2fx + %.2f = 0\n", a, b, c);
		
		double delta = ((b * b) - 4 * a * c);
		System.out.println("Esse é o seu delta: " + delta);
		
		String resultado1 = delta < 0 ? "Não existe raiz real" : "";
		System.out.println(resultado1);
		
		double x1 = delta == 0 ? (-b + Math.sqrt(delta)) / (2 * a) : 0;
		x1 = delta > 0 ? (-b + Math.sqrt(delta)) / (2 * a) : x1;
		double x2 = delta > 0 ? (-b - Math.sqrt(delta)) / (2 * a) : x1;
		
		System.out.printf("O x1 é %.2f e o x2 é %.2f", x1, x2);
				
		entrada.close();
	}
}

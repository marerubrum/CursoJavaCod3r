package fundamentos.exercicio2;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu primeiro salário");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o seu segundo salário");
		String valor2 = entrada.nextLine().replace(",", ".");

		System.out.println("Digite o seu terceiro salário");
		String valor3 = entrada.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
				
		double resultado = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("Essa é a média dos 3 salários: %.2f", resultado);
		entrada.close();
	}
}

package fundamentos.exercicios3;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		//Pegar o terminal do usuário e ler o primeiro número
		//Ler o número 2
		//Qual a operação o usário quer fazer
		//+ - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		String num1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o segundo número");
		String num2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o operador");
		String operador = entrada.next();
		
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		
		double resultado = "+".equals(operador) ? n1 + n2 : 0;
		resultado = "-".equals(operador) ? n1 - n2 : resultado;
		resultado = "*".equals(operador) ? n1 * n2 : resultado;
		resultado = "/".equals(operador) ? n1 / n2 : resultado;
		resultado = "%".equals(operador) ? n1 % n2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f\n", n1, operador, n2, resultado);
		
		entrada.close();
	}
}

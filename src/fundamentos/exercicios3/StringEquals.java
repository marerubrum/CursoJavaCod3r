package fundamentos.exercicios3;

import java.util.Scanner;

public class StringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite");
		String z = entrada.next();
		
		System.out.println("2" == z.trim());
		System.out.println("2".equals(z.trim()));
		
		entrada.close();
	}
}

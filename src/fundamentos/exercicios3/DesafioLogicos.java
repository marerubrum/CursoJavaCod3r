package fundamentos.exercicios3;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (v ou F)
		// Traalho na quinta (V ou F)
		
		boolean trabalho1 = !false;
		boolean trabalho2 = !false;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2; 
		
		System.out.println("Comprou a tv de 50\"? " + tv50);
		System.out.println("Comprou a tv de 32\"? " + tv32);
		System.out.println("Comprou o sorvete? " + sorvete);
		System.out.println("Mais saudável? " + !sorvete); //operador unário		
	}
}

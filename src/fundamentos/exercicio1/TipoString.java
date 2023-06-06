package fundamentos.exercicio1;

public class TipoString {
	
	public static void main(String[] args) {
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salário = 12345.987;
		
		System.out.printf("O senhor %s %s tem %d e recebe R$%.2f.", nome, sobrenome, idade, salário);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));		
		
	}
}

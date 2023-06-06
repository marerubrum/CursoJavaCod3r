package fundamentos.exercicios3;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 4.9;
		
		String resultadoParcial = media >= 5 ? "Em recuperação." : "reprovado.";
		String resultadoFinal = media >= 7 ? "Aprovado." : resultadoParcial;
		System.out.println("O aluno está " + resultadoFinal);
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim." : "não.";
		
		System.out.println("tem desconto? " + resultado);
	}
}

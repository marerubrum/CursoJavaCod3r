package fundamentos.exercicios3;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
//		c = c + b;
		c += b;
		c -= b;
		c *= b;
		c /= b;
		c %= 2; // 0 ou 1 (par ou ímpar)
		
		System.out.println(c);
	}
}

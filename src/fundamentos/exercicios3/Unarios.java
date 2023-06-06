package fundamentos.exercicios3;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;
		a--;
		
		++b;
		--b;
		
		System.out.printf("%d %d\n", a, b);
		System.out.println(++a == b--); // a precedência do -- é menor que a de comparação
		System.out.printf("%d %d\n", a, b);		
	}
}

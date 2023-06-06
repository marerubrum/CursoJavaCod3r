package fundamentos.exercicio1;

public class NotaçãoPonto {
	
	public static void main(String[] args) {
		String s = "Bom dia x";
		s = s.replace("x", "!!!");
		s = s.toUpperCase();
		s = s.concat("!!!");
		String y = "Bom dia x"
				.replace("x", "!!!")
				.concat("!!!")
				.toUpperCase();
		
		System.out.println(s + "\n" + y);
	}
}

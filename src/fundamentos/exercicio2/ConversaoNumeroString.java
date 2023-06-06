package fundamentos.exercicio2;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer a = 10000;
		System.out.println(a.toString().length());
		
		int b = 100000;
		System.out.println(Integer.toString(b).length());
		System.out.println(("" + b).length());
	}
}

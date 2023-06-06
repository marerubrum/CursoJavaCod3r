package fundamentos.exercicio2;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1.123456789101112; //implícito
		System.out.println(a);
		
		float b = (float) 1.123456789101112; //explícito (CAST)
		System.out.println(b);
		
		int c = 130; //java lê o numero novamente do começo
		byte d = (byte) c; //explícito CAST
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; //explícito (CAST)
		System.out.println(f);
		
		
	}
}

package estruturasDeControle.exercicios2;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		//não pode usar valor numerico para controlar o laço		
		for(String v = "#"; !v.equalsIgnoreCase("######"); v += "#") {
			System.out.println(v);
		}
	}
}

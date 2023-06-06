package estruturasDeControle.exercicios3;

public class Continue2 {

	public static void main(String[] args) {

//		não recomendado o uso		
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1)
					continue externo;
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println("");
		}
		System.out.println("Fim!");
	}
}

package fundamentos.exercicio2;

public class DesafioOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		double superiorA = Math.pow((6 *(3 + 2)), 2)  / (3 * 2);
		double superiorB = Math.pow((((1 - 5) * (2 - 7)) / 2), 2);
		double resultado = Math.pow((superiorA - superiorB), 3) / Math.pow(10, 3);
		
		System.out.printf("%.2f \n%.2f \n%.2f", superiorA, superiorB, resultado);
		
	}
}

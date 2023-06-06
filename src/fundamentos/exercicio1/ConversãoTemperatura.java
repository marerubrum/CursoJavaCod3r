package fundamentos.exercicio1;

public class ConversãoTemperatura {
	
	public static void main(TipoString[] args) {
//		 (°F - 32) * 5/9 = °C
		final double ajuste = 32;
		final double fator = 5.0 / 9.0;
		double grausF = 212;
		double grausCelsius = ((grausF - ajuste) * fator); 
		System.out.println("O resultado é: " + grausCelsius + "°C.");		
	}
}

package fundamentos.exercicio1;

public class TiposPrimitivos {
	
	public static void main(TipoString[] args) {
		
		// informações de um funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numéricos reais
		float salário = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Lógicos
		boolean estaDeFerias = true;
		
		//Caracteres
		char status = 'A'; // Ativo
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salário);
		System.out.println("férias? " + estaDeFerias);
		System.out.println(status);
	}
}

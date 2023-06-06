package classesEMetodos.classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	Data() {
		this(1, 1, 1970); // chama o construtor de cima
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // variável local
		return String.format(formato, dia, mes, ano);
	}
}

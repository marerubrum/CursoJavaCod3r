package classesEMetodos.classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 5, 2023);
		Data d2 = d1; //atribuição por referência
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2012;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrão(d1);
		
		System.out.println(d1.obterDataFormatada());
	}
	
	static void voltarDataParaValorPadrão(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}	
}

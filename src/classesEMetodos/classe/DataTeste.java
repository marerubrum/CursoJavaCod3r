package classesEMetodos.classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(15,5,2005);
		
		System.out.println(d1.obterDataFormatada());
		
		var d2 = new Data();
		d2.ano = 1514;
		
		System.out.println(d2.obterDataFormatada());		
	}
}

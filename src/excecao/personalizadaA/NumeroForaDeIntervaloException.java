package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDeIntervaloException extends RuntimeException {

	private String nomedoAtributo;
	
	public NumeroForaDeIntervaloException(String nomeDoAtributo) {
	this.nomedoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.",
				nomedoAtributo);
	}
}

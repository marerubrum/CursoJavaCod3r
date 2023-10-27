package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaDoAniversariante> observadores = 
			new ArrayList<>();

	public void registrarObservador(ObservadorChegadaDoAniversariante observador) {
		observadores.add(observador);
	}

	public void monitorar() {
		Scanner entrada = new Scanner(System.in);

		String valor = "";
		while (!"sair".equalsIgnoreCase(valor)) {

			System.out.println("O aniversariante chegou?");
			valor = entrada.nextLine();
			
			if ("sim".equalsIgnoreCase(valor)) {
				// criar o evento
				EventoChegadaAniversariante evento = 
						new EventoChegadaAniversariante(new Date());

				// Notificar os observadores
				observadores.stream()
					.forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso");
			}
		}

		entrada.close();
	}
}
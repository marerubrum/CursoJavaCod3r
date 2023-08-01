package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Add e Offer adicionam elementos
		//Quando a fila estiver cheia, 
		//Add lança exception e Offer retorna False
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Guilherme");
		
		//Acessam o próximo elemento dentro da fila, sem remover
		//Com fila vazia, Peek retorna null e Element lança exception
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains("bia");
		
		
		//Poll e Remove obtem o próximo elemento e removem
		//Diferença quando fila está vazia
		System.out.println(fila.poll()); //Retorna null
		System.out.println(fila.remove()); //Lança exception
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}

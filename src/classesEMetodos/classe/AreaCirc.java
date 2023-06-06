package classesEMetodos.classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * PI;
	}
	
	static double area(double raio) {
		return raio * raio * PI;		
	}
}

package proyectounidad1.ejemplosunidad1;

public class LaClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radio= 6;
		double pi =Math.PI;
		
		//Math tiene operaciones matemáticas, como la raiz cuadadrada, potencia o seno.
		//potencia
		double areaCirculo= pi*Math.pow(radio, 2);
		
		double raizCuadrada = Math.sqrt(areaCirculo);
		//seno
		double seno = Math.sin(2*Math.PI);

	}

}

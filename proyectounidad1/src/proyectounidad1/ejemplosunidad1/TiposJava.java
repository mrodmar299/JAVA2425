package proyectounidad1.ejemplosunidad1;

public class TiposJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NUM_CONT=5;
		boolean b=true;
		char ch='s';
		int num=2;
		long numLong = 10L;
		double dec= 10.2;
		float decFloat= 10.2f;
		double sum = 0.0;
		byte numByte= -127;
		String cadena= "Numero decimal float: " + decFloat;
		
		System.out.println("Numero decimal: " + dec);
		System.out.println(cadena);
		//las constantes nose pueden modificar
		// NUM_CONT=5;
		num=3;

		
		sum = dec + decFloat;
		
		System.out.println(decFloat);
		
		decFloat= (float) dec;
		
		System.out.println("caracter: " + ch);
		System.out.println("Numero entero:"+ numByte);
		
		
		
		
	}

}

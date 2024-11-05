package proyectounidad2.ejer1_10;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x, y;
		Scanner sc = new Scanner(System.in);
		// Recoger valores del teclado;
		System.out.println("Introduce un valor para a ");
		x = sc.nextFloat();
		System.out.println("Introduce un valor para b ");
		y = sc.nextFloat();
		if (x > y) {
			System.out.println("El valor " + x + " es mayor que " + y);
		} else if (y > x) {
			System.out.println("El valor " + y + " es mayor que " + x);
		}

		else {
			System.out.println("Ambos valores son iguales");
		}
	}

}

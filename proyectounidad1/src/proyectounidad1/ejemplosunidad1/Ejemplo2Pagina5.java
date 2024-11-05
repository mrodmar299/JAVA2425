package proyectounidad1.ejemplosunidad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo2Pagina5 {
	// ax^2 + bx +c =0;
	public static void main(String[] args) {
		// Variables locales
		float a, b, c;
		double x1, x2;
		// Creación de un objeto Scanner para poder recoger datos de teclado
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // Para poder utilizar el punto con los decimales
		// Recoger de teclado los valores de entrada (a, b y c)
		System.out.println("Introduzca el valor para 'a': ");
		a = sc.nextFloat();
		System.out.println("Introduzca el valor para 'b': ");
		b = sc.nextFloat();
		System.out.println("Introduzca el valor para 'c': ");
		c = sc.nextFloat();
		// Cálculo de las dos raíces, sólo en el caso de que el discriminante sea
		// positivo
		if ((Math.pow(b, 2) - 4 * a * c) > 0) {
			x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			System.out.println("Las raíces valen: " + x1 + " y " + x2);
		} // end if
		sc.close();
	}

}

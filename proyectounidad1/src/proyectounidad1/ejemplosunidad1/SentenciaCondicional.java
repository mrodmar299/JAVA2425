package proyectounidad1.ejemplosunidad1;

import java.util.Scanner;

public class SentenciaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 0;
		String apellidos;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la edad por pantalla");
		edad = sc.nextInt();
		sc.nextLine();

		System.out.println("La edad es: " + edad);
		
		if(edad>=18) {
			System.out.println("La persona es una adulto ");
			
		} else if (edad >15){
			
			System.out.println("La persona es un adolescente ");
		} else {
			
			System.out.println("La persona es un menor");
		}
		
		
		
		System.out.println("Introduce los apellidos por pantalla");
		apellidos = sc.nextLine();
		

	}

}

package proyectounidad1.ejemplosunidad1;

import java.util.Scanner;

public class InputOutputJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=0;
		String nombre="";
		double salario= 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la edad por pantalla");
		
		edad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Introduce el nombre por pantalla");
		
		nombre= sc.nextLine();
		
		System.out.println("Introduce el salario por pantalla");
		
		salario= sc.nextDouble();

		
		
		sc.nextLine();
		
		

	}

}

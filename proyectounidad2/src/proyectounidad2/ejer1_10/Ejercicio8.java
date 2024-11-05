package proyectounidad2.ejer1_10;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Introduce un número  ");
		num1= sc.nextInt();
		System.out.println("Introduce otro número ");
		num2 = sc.nextInt();
		
		if (num2 % num1 == 0)
			System.out.println("El número " + num1 + " es divisor de " + num2);
		else 
			
			System.out.println("El número " + num1 + " no es divisor de " + num2);
		
		

	}

}

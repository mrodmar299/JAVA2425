package proyectounidad2.ejer1_10;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		int num=1;
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce un número");
		
		num= sc.nextInt();
		if (num%2==0)
		System.out.println(" El número introducido es par ");
		else
			System.out.println(" El número introducido es impar ");
		
	}

}

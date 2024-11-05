package proyectounidad1.ejercicios.ejer1_10;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0,num3=0;
		double res=0;
		System.out.println("Introduce una cifra");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
								
		System.out.println("Introduce una segunda cifra ");
		num2=sc.nextInt();
		
				
		System.out.println("Introduce la tercera cifra");
		num3=sc.nextInt();
						
		res= (num1+num2+num3)/(double) 3;
		res= (num1+num2+num3)/3.0;
					
		System.out.println("La media de " + (num1  + num2 + num3) +  " es: " + res);
		
				

	}

}

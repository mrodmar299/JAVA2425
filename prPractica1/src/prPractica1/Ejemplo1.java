package prPractica1;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int edad=0;
Scanner sc=new Scanner(System.in);
System.out.println("Introduce la edad");
edad=sc.nextInt();
edad= edad+1;
System.out.println("El año que viene tendrás "+ edad +" años ");
	}
}

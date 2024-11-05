package proyectounidad1.ejercicios.ejer1_10;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int annioActual=0,annioNacimiento=0;
int res;

Scanner sc=new Scanner(System.in);
System.out.println("Introduce el año actual");
annioActual=sc.nextInt();
sc.nextLine();
System.out.println("Introduce el año de nacimiento");
annioNacimiento=sc.nextInt();
sc.nextLine();

res=annioActual-annioNacimiento;

System.out.println("Tu edad actual es " + res + " años ");


	}

}

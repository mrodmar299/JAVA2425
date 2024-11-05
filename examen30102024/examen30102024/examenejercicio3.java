package examen30102024;

import java.util.Scanner;

public class examenejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Se pide información para poder calcular el precio
		System.out.println("Introduzca numero de invitados al evento: ");
		Scanner sc=new Scanner(System.in);
							
		System.out.println("¿Cuántos cake pops desea añadir?: ");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("¿Cuántos donuts desea añadir?: ");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Desea añadir una fuente de chocolate: ");
		Scanner sc=new Scanner(System.in);
		
		short invitados=0;
		byte cakepops=0;
		byte donuts=0;
		int montaje=80;
		int res=0;
		
		//para mezclar diferentes clases habia que hacer algo pero no lo recuerdo
		//No esta bien escrito para indicar s/n,pero no la recuerdo
		 String fuentechocolate = "s"; 
		 //Ahora calcularia los importes según las cantidades ingresadas, pero tampoco me sale
		res=invitados*1;
		res=cakepops*(double)0.25;
		
		//si en el resultado hay decimales se puede poner en uno solo		
		
		res=donuts*(double)0.30;
		
			if {
				//se pondria la condicional para pòder elegir si se carga en el importe o no la fuente de chololate
			}
		
				
		 
		  
		 System.out.println("COSTE TOTAL DE LA MESA ASCIENDE A: " + cakepops+ donuts + montaje + fuentechocolate );
		  System.out.println("Coste montaje: 80 euros ");
		  System.out.println("Número de invitados: "+invitados);
		  System.out.println("Cake pops: " + cakepops);
		  System.out.println("Donuts: "+ donuts);
		  System.out.println("Fuente de chocolate: " + "s");
		 
			sc.close();
	}

}

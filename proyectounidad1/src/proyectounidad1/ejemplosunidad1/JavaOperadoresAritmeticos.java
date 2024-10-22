package proyectounidad1.ejemplosunidad1;

public class JavaOperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num1=3,num2=5;
		int res=0;
		double divDec=1.0;
		
		res= num1 +num2;
		
		System.out.println("Suma de " + num1 + " y " + num2 + " es: " + (num1+num2));
		
		System.out.println("Suma de " + num1 + " y " + num2 + " es: " + res);
		
		res=num1-num2;
		System.out.print("La resta de " + num1+ " y " + num2 + " es: " + (num1-num2) );
		System.out.print("La resta de " + num1+ " y " + num2 + " es: " + res );
		
		
		res=num1*num2;
		System.out.println("La multiplicación de " + num1 +" y " + num2 + " es " + (num1*num2) );
		System.out.println("La multplicación de " + num1 +" y " + " es: " +res);
		
		res=num1/num2;
				System.out.println("La división de " + num1+ " y " +num2 + " es: " + (num1/num2) );
				System.out.println("La división de "  + num1+ " y " +num2 + " es "+ res);
				
				
		res=num1%num2;
		
		System.out.println("El resto de la división de " + num1+ " y " +num2 + " es: " + (num1%num2) );
		System.out.println("El resto de la  división de "  + num1+ " y " +num2 + " es "+ res);

	
		divDec=num1/(double) num2;
		
		System.out.println("La división decimal de " + num1+ " y " +num2 + " es: " + (num1/(double)num2) );
		System.out.println("La división decimal de "  + num1+ " y " +num2 + " es "+ divDec);
		

	
	}

}

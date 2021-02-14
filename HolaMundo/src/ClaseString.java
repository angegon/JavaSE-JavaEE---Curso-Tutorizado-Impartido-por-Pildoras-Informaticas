import java.util.Scanner;

public class ClaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Concatenación de strings
		double salario = 1850.55;
		double salarioEnDolares = salario * 1.2;
		
		System.out.println("El salario de Manuel es: " + salario);
		
		System.out.println("El salario de Manuel es: " + salario + " euros a dia de hoy.");
		
		System.out.println("El salario de Manuel en dolares es: " + salarioEnDolares);
		
		System.out.println("El salario de Manuel menos impuestos es: " + (salario - 300));
		
		int edad; 
		
		Scanner entradaDato = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor: ");
		
		edad = entradaDato.nextInt();
		
		System.out.println("La edad introducida es: " + edad);
		
		//Algunos Metodos de la clase
		String mi_nombre="Juan";
		String mi_nombre2="juan";
		String cadena = "Vivo en España";
		System.out.println("Mi nombre tiene " + mi_nombre.length() + "caracteres");
		System.out.println("El tecer caracter de mi nombre es " + mi_nombre.charAt(2));
		System.out.println("Un ejemplo de uso de subcadenas " + cadena.substring(3, 7));
		
		
		if (mi_nombre.equals(cadena)) //tiene en cuenta mayusculas y minusculas
			System.out.println("Las cadenas son iguales");
		
		if (mi_nombre.equalsIgnoreCase(mi_nombre2)) // No tiene en cuenta mayusculas y minusculas			System.out.println("Las cadenas son iguales");
			System.out.println("Las cadenas son iguales");
	}

}

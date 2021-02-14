import java.util.Scanner;

public class ConcatenacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}

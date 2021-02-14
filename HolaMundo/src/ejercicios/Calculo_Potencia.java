package ejercicios;

public class Calculo_Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, exponente;
		long resultado;
		
		base = 5;
		exponente = 12;
		
		resultado = (long) Math.pow(base, exponente);
		System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
	}

}

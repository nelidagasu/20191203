package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/* 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de dos o más números
	 * enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3), 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e indique si éste es guay.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		int numero;
		int suma = 0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número para saber si es guay:");
		numero = sc.nextInt();
		
		switch (numero) {
			case 0:
				System.out.println("El número 0 no es un número guay.");
				break;
			case 1:
				System.out.println("El número 1 no es un número guay.");
				break;
			default:				
				for (int i = 1; i < numero; i++) {
//					System.out.println("i " + i);
					suma = i;
					contador = 1;
					
					for (int j = i + 1; j < numero; j++) {
						suma = suma + j; 
//						System.out.println("j " + j + " suma " + suma + " contador " + contador);
						
						contador ++;
						
						if (suma == numero)
							break;
					}	
					
//					System.out.println("i " + i + " suma " + suma + " contador " + contador);
					
					if (suma == numero)
						break;
				}				
//				System.out.println("fuera suma " + suma + " contador " + contador);
		}
		
		if (contador > 1 & suma == numero)
			System.out.println("El número " + numero + " es un número guay.");
		else
			System.out.println("El número " + numero + " no es un número guay.");
	}

}

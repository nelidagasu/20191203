package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números enteros y calcule
	 * la suma de todos los números impares comprendidos entre ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se introduzcan los dos números
	 * (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */
	
	public static void main(String[] args) {
		int suma = 0;
		int inicio = 0;
		int fin = 0;
		int mayor = 0;
		int menor = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Introduzca el primer número para hacer la suma");
		try {
			inicio = Integer.valueOf(br.readLine());
			
			System.out.println("Introduzca el segundo número para hacer la suma");
			fin = Integer.valueOf(br.readLine());
			
			if (inicio > fin) {
				menor = fin;
				mayor = inicio;
			} else {
				menor = inicio;
				mayor = fin;
			}
			
			int contador = menor;
			
			do {
				if (contador % 2 != 0) {
					suma = suma + contador;
				}
				
				contador ++;
			} while (contador < mayor);
			
			suma = suma + mayor;
			
			System.out.println("La suma de los números impares entre " + menor + " y " + mayor + " es " + suma);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

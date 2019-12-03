package fp.daw.examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	/* 
	 * 4 puntos
	 * 
	 * Escribir en el método main un programa que pida por teclado un número decimal menor o igual
	 * que 3000 y muestre por pantalla el resultado de convertirlo a un número romanos.
	 *     
	 *     La conversión se realizará transformando individualmente cada dígito, empezando por el correspondiente
	 *     a las unidades de millar, seguido de las centenas, decenas y unidades de la forma siguiente:
	 *     
	 *     		Dígito decimal		|	Transformación
	 *     		--------------------|----------------------------------------------------------------------------
	 *     		1, 2 o 3			|	Escribir C1 de una a tres veces
	 *     		4					|	Escribir C1 seguido de C2
	 *     		5, 6, 7 o 8			|	Escribir una vez C2 seguido de C1 de cero a tres veces
	 *     		9					|	Escribir C1 seguido de C3
	 *     
	 *     donde C1, C2 y C3 son los caracteres de numeración romana que corresponda según la tabla siguiente:
	 *     
	 *     							|   C1   |   C2   |   C3   |
	 *     		--------------------|--------|--------|--------|        
	 *     		unidades			|	I    |   V    |   X    |
	 *     		decenas				|	X    |   L    |   C    |
	 *     		centenas			|	C    |   D    |   M    |
	 *     		unidades de millar	|	M    |        |        |
	 *     
	 *     Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */

	public static void main(String[] args) {
		String numero;
		ArrayList <String> partes = new ArrayList<>();
		String romano;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número menor que 3000 para convertirlo a números romanos.");
		
		numero = sc.next();
		 
		if (Integer.valueOf(numero) > 3000)
			System.out.println("El número debe ser menor que 3000.");
		else {
			for (int i = 0; i < numero.length(); i++) {
				partes.add(numero.substring(i, i+ 1));
			}
			
			if (numero.length() == 4)
				romano = millares(Integer.valueOf(partes.get(0))) + centenas(Integer.valueOf(partes.get(1)))
							+ decenas(Integer.valueOf(partes.get(2))) + unidades(Integer.valueOf(partes.get(3)));
			else if (numero.length() == 3) 
				romano = centenas(Integer.valueOf(partes.get(0))) + decenas(Integer.valueOf(partes.get(1))) 
							+ unidades(Integer.valueOf(partes.get(2)));
			else if (numero.length() == 2) 
				romano = decenas(Integer.valueOf(partes.get(0))) + unidades(Integer.valueOf(partes.get(1)));
			else 
				romano = unidades(Integer.valueOf(partes.get(0)));
			
			System.out.println("El número " + numero + " en números romanos es " + romano);
		}
	}
	
	public static String millares(int uni) {
		String resultado = "";;
		
		switch (uni) {
			case 1:	
				resultado = "M";
				break;
			case 2: 
				resultado = "MM";
				break;
			case 3:
				resultado = "MMM";
				break;
			default: 
				break;
		}
		
		return resultado;		
	}
	
	public static String centenas(int uni) {
		String resultado = "";;
		
		switch (uni) {
			case 1:	
				resultado = "C";
				break;
			case 2: 
				resultado = "CC";
				break;
			case 3:
				resultado = "CCC";
				break;
			case 4:
				resultado = "CD";
				break;
			case 5:
				resultado = "D";
				break;
			case 6:
				resultado = "DC";
				break;
			case 7:
				resultado = "DCC";
				break;
			case 8:
				resultado = "DCCC";
				break;
			case 9:
				resultado = "CM";
				break;
			default: 
				break;
		}
		
		return resultado;		
	}
	
	public static String decenas(int uni) {
		String resultado = "";;
		
		switch (uni) {
			case 1:	
				resultado = "X";
				break;
			case 2: 
				resultado = "XX";
				break;
			case 3:
				resultado = "XXX";
				break;
			case 4:
				resultado = "XL";
				break;
			case 5:
				resultado = "L";
				break;
			case 6:
				resultado = "LX";
				break;
			case 7:
				resultado = "LXX";
				break;
			case 8:
				resultado = "LXXX";
				break;
			case 9:
				resultado = "XC";
				break;
			default: 
				break;
		}
		
		return resultado;		
	}
	
	public static String unidades(int uni) {
		String resultado = "";;
		
		switch (uni) {
			case 1:	
				resultado = "I";
				break;
			case 2: 
				resultado = "II";
				break;
			case 3:
				resultado = "III";
				break;
			case 4:
				resultado = "IV";
				break;
			case 5:
				resultado = "V";
				break;
			case 6:
				resultado = "VI";
				break;
			case 7:
				resultado = "VII";
				break;
			case 8:
				resultado = "VIII";
				break;
			case 9:
				resultado = "IX";
				break;
			default: 
				break;
		}
		
		return resultado;		
	}
	
}

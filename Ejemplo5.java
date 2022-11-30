import java.util.Scanner;

/**
*
*	Ejemplo 5,   Realiza un programa que calcule y muestre por pantalla de
* valor de A elevado a B (sin usar el operador potencia ni método de Math).
* Serán leidos por pantalla los números A y B.
* 
*	Nombre del archivo: Ejemplo5.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo5 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Por favor, introduce los valores de A: ");
		int a = datos.nextInt();
		System.out.print("Por favor, introduce los valores de B: ");
		int b = datos.nextInt();
		
		int valor = a;
		
		for (int i = 1; i <= b; i++) {
		
			valor = valor * a;
			
			System.out.println(valor);
			
		}
		
	}
}

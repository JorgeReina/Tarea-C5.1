import java.util.Scanner;

/**
*
*	Ejemplo 2,  Programa que muestre por pantalla los números naturales 
* hasta un valor introducido por teclado.
* 
*	Nombre del archivo: Ejemplo2.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo2 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un número por pantalla.
		System.out.print("Por favor, introduce un número: ");
		int n = datos.nextInt();
		
		int i = 0;
		
		//Definimos el bucle while
		while ( i <= n) {
			System.out.println(i);
			i++;
		}
		
	}
}

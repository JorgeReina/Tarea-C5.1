/**
*
*	Ejemplo 3,  Programa que calcule y muestre por pantalla la suma y 
* el producto de los 10 primeros números naturales.
* 
*	Nombre del archivo: Ejemplo3.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo3 {
	public static void main(String[] args) {
		
		System.out.println("SUMA de los 10 primeros números naturales.");
		for (int i = 1; i <= 10; i++) {
			int suma = i+i;
			System.out.printf("%s + %s = %s\n", i, i, suma);
		}
		System.out.println();
		System.out.println("MULTIPLICACIÓN de los 10 primeros números naturales.");
		for (int i = 1; i <= 10; i++) {
			int mult = i*i;
			System.out.printf("%s * %s = %s\n", i, i, mult);
		}
		
	}
}

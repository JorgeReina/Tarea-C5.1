/**
*
*	Ejemplo 1,  Programa que muestra por pantalla los números pares entre 0 y 20
* 
*	Nombre del archivo: Ejemplo1.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo1 {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 20; i++) {
			int par = i % 2;
			if (par == 0) {
				System.out.println(i);
			}
		}
		
	}
}

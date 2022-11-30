/**
*
*	Ejemplo 4,  Programa que calcule y muestre por pantalla, independientemente 
* la suma de los números pares y la suma de impares de los números comprendidos 
* entre 100 y 200.
* 
*	Nombre del archivo: Ejemplo4.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo4 {
	public static void main(String[] args) {
		
		int nPar = 0;
		int nImpar = 0;
		
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				nPar = nPar + i;
			}else {
				nImpar = nImpar + i;
			}
		}
		
		System.out.printf("La suma de los números pares es: %s\n", nPar);
		System.out.printf("La suma de los números impares es: %s\n", nImpar);
		
	}
}

/**
 * FA�A UM PROGRAMA QUE LEIA TR�S N�MEROS E MOSTRE-OS 
 * EM ORDEM DECRESCENTE.
 */
package lista2;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1� N�mero: ");
		double numero1 = sc.nextDouble();
		System.out.print("2� N�mero: ");
		double numero2 = sc.nextDouble();
		System.out.print("3� N�mero: ");
		double numero3 = sc.nextDouble();
		
		if(numero1 <= numero2 && numero2 <= numero3) {
			System.out.println(numero3 + ", " + numero2 + ", " + numero1);
		}
		else if(numero1 <= numero3 && numero3 <= numero2) {
			System.out.println(numero2 + ", " + numero3 + ", " + numero1);
		}
		else if(numero2 <= numero1 && numero1 <= numero3) {
			System.out.println(numero3 + ", " + numero1 + ", " + numero2);
		}
		else if(numero2 <= numero3 && numero3 <= numero1) {
			System.out.println(numero1 + ", " + numero3 + ", " + numero2);
		}
		else if(numero3 <= numero1 && numero1 <= numero2) {
			System.out.println(numero2 + ", " + numero1 + ", " + numero3);
		}
		else {
			System.out.println(numero1 + ", " + numero2 + ", " + numero3);
		}
		sc.close();

	}

}

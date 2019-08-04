/**
 * FAÇA UM PROGRAMA QUE LEIA TRÊS NÚMEROS
 * E MOSTRE O MAIOR DELES.
 */
package lista2;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1° Número: ");
		double numero1 = sc.nextDouble();
		System.out.print("2° Número: ");
		double numero2 = sc.nextDouble();
		System.out.print("3° Número: ");
		double numero3 = sc.nextDouble();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("1° número é o maior (" + numero1 + ")");
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("2° número é o maior (" + numero2 + ")");
		}
		else {
			System.out.println("3° número é o maior (" + numero3 + ")");
		}
		sc.close();

	}

}

/**
 * FAÇA UM PROGRAMA QUE PEÇA DOIS NÚMEROS 
 * E IMPRIMA O MAIOR DELES.
 */
package lista2;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		double numero1 = sc.nextDouble();
		System.out.print("Entre com o segundo número: ");
		double numero2 = sc.nextDouble();
		
		if(numero1 > numero2) {
			System.out.println("O maior número é o " + numero1);
		}else {
			System.out.println("O maior número é o " + numero2);
		}
		
		
		sc.close();

	}

}

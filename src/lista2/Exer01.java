/**
 * FA�A UM PROGRAMA QUE PE�A DOIS N�MEROS 
 * E IMPRIMA O MAIOR DELES.
 */
package lista2;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro n�mero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Entre com o segundo n�mero: ");
		double numero2 = sc.nextDouble();
		
		if(numero1 > numero2) {
			System.out.println("O maior n�mero � o " + numero1);
		}else {
			System.out.println("O maior n�mero � o " + numero2);
		}
		
		
		sc.close();

	}

}

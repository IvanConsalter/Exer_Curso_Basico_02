/**
 * FA�A UM PROGRAMA QUE PE�A UM N�MERO INTEIRO E DETERMINE SE ELE � 
 * PAR OU �MPAR.
 * DICA UTILIZE O OPERADOR M�DULO(RESTO DA DIVIS�O).
 */
package lista2;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � PAR");
		}
		else {
			System.out.println(numero + " � �MPAR");
		}
		sc.close();

	}

}

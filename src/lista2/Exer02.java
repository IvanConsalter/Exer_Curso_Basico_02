/**
 * FAÇA UM PROGRAMA QUE PEÇA UM VALOR E MOSTRE NA TELA
 * SE O VALOR É POSITIVO OU NEGATIVO.
 */
package lista2;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		double valor = sc.nextDouble();
		
		if (valor < 0) {
			System.out.println("É negativo");
		}else {
			System.out.println("É positivo");
		}
		
		
		sc.close();

	}

}

/**
 * FAÇA UM PROGRAMA QUE PEÇA UM NÚMERO INTEIRO E DETERMINE SE ELE É 
 * PAR OU ÍMPAR.
 * DICA UTILIZE O OPERADOR MÓDULO(RESTO DA DIVISÃO).
 */
package lista2;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " é PAR");
		}
		else {
			System.out.println(numero + " é ÍMPAR");
		}
		sc.close();

	}

}

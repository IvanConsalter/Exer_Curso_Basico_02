/**
 * FAÇA UM PROGRAMA QUE VERIFIQUE SE UMA LETRA DIGITADA
 * É "F" OU "M".
 * CONFORME A LETRA ESCREVER: F - FEMININO, M - MASCULINO, SEXO INVÁLIDO.
 */
package lista2;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("F - Feminino");
		System.out.println("M - Masculino");
 
		System.out.print("Entre com uma letra: ");
		String letra = sc.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - FEMININO");
		}else if(letra.equalsIgnoreCase("m")) {
			System.out.println("M - MASCULINO");
		}else {
			System.out.println("SEXO INVÁLIDO");
		}
		sc.close();

	}

}

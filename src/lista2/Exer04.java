/**
 * FA�A UM PROGRAMA QUE VERIFIQUE SE UMA LETRA DIGITADA
 * � VOGAL OU CONSOANTE.
 */
package lista2;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a letra: ");
		String letra = sc.next();
		
		if(letra.length() > 1) {
			System.out.println("N�o � uma letra v�lida.");	
		}	
		else if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||
			letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
			System.out.println("A letra (" + letra + ") � vogal");
		}
		else {
		System.out.println("A letra (" + letra + ") � consoante");
		}
		sc.close();
	}

}

/**
 * FA�A UM PROGRAMA QUE PERGUNTE EM QUE TURNO VOC� ESTUDA.
 * PE�A PARA DIGITAR "M-MATUTINO" OU "V-VESPERTINO" OU "N-NOTURNO".
 * IMPRIMA A MENSAGEM "BOM DIA!", "BOA TARDE!" OU "BOA NOITE!" OU
 * "VALOR INV�LIDO!", CONFORME O CASO
 */
package lista2;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ---------------");
		System.out.println("| M-MATUTINO    |");
		System.out.println("| V-VESPERTINO  |");
		System.out.println("| N-NOTURNO     |");
		System.out.println(" ---------------");
		
		System.out.print("Qual turno voc� estuda?:");
		String turno = sc.next();
		if(turno.length() > 1 ) {
			System.out.println("C�DIGO INV�LIDO!");
		}
		else if(turno.equalsIgnoreCase("m")) {
			System.out.println("BOM-DIA!");
		}else if (turno.equalsIgnoreCase("v")) {
			System.out.println("BOA-TARDE!");
		}
		else if (turno.equalsIgnoreCase("n")) {
			System.out.println("BOA-NOITE!");
		}
		else {
			System.out.println("C�DIGO INV�LIDO!");
		}
		
		sc.close();

	}

}

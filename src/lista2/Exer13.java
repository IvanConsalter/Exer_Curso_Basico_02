/**
 * FA�A UM PROGRAMA QUE LEIA UM N�MERO E EXIBA O DIA CORRESPONDENTE
 * DA SEMANA. (1-DOMINGO, 2-SEGUNDA, ETC), SE DIGITA OUTRO VALOR DEVE APARECER INV�LIDO.
 */
package lista2;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com Dia correspondente da semana: ");
		int dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA");
			break;
		case 3:
			System.out.println("TER�A");
			break;
		case 4:
			System.out.println("QUARTA");
			break;
		case 5:
			System.out.println("QUINTA");
			break;
		case 6:
			System.out.println("SEXTA");
			break;
		case 7:
			System.out.println("S�BADO");
			break;
		default:
			System.out.println("C�DIGO INV�LIDO");
		}

		sc.close();

	}

}

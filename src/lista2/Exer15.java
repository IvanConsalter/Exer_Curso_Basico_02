/**
 * FA�A UM PROGRAMA QUE PE�A OS TR�S LADOS DE UM TRI�NGULO.
 * O PROGRAMA DEVER� INFORMAR SE OS VALORES PODEM SER UM TRI�NGULO.
 * INDIQUE, CASO OS LADOS FORMEM UM TRI�NGULO, SE O MESMO �:
 * EQUIL�TERO, IS�SCELES OU ESCALENO.
 * 
 * DICAS:
 * TR�S LADOS FORMAM UM TRI�NGULO QUANDO A SOMA DE QUAIQUER
 * DOIS LADOS FOR MAIOR QUE O TERCEIRO;
 * TRI�NGULO EQUIL�TERO: TR�S LADOS IGUAIS;
 * TRI�NGULO IS�SCELES: QUAISQUER DOIS LADOS IGUAIS;
 * TRI�NGULO ESCALENO: TR�S LADOS DIFERENTES;
 */
package lista2;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 1� lado: ");
		double lado1 = sc.nextDouble();

		System.out.print("Digite 2� lado: ");
		double lado2 = sc.nextDouble();

		System.out.print("Digite 3� lado: ");
		double lado3 = sc.nextDouble();
		
		if(lado1 < (lado2 - lado3) || lado2 < (lado1 - lado3) || lado3 < (lado1 - lado2) ) {
			System.out.println("N�o pode ser formado um tri�ngulo.");
		}
		else if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Forma um tri�ngulo: EQUIL�TERO");
		}
		else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1) {
			System.out.println("Forma um tri�ngulo: IS�SCELES");
		}
		else if (lado1 != lado2 && lado2 != lado3) {
			System.out.println("Forma um tri�ngulo: ESCALENO");
		}
		
		
		sc.close();

	}

}

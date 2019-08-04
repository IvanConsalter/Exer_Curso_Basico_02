/**
 * FAÇA UM PROGRAMA QUE PEÇA OS TRÊS LADOS DE UM TRIÂNGULO.
 * O PROGRAMA DEVERÁ INFORMAR SE OS VALORES PODEM SER UM TRIÂNGULO.
 * INDIQUE, CASO OS LADOS FORMEM UM TRIÂNGULO, SE O MESMO É:
 * EQUILÁTERO, ISÓSCELES OU ESCALENO.
 * 
 * DICAS:
 * TRÊS LADOS FORMAM UM TRIÂNGULO QUANDO A SOMA DE QUAIQUER
 * DOIS LADOS FOR MAIOR QUE O TERCEIRO;
 * TRIÂNGULO EQUILÁTERO: TRÊS LADOS IGUAIS;
 * TRIÂNGULO ISÓSCELES: QUAISQUER DOIS LADOS IGUAIS;
 * TRIÂNGULO ESCALENO: TRÊS LADOS DIFERENTES;
 */
package lista2;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 1° lado: ");
		double lado1 = sc.nextDouble();

		System.out.print("Digite 2° lado: ");
		double lado2 = sc.nextDouble();

		System.out.print("Digite 3° lado: ");
		double lado3 = sc.nextDouble();
		
		if(lado1 < (lado2 - lado3) || lado2 < (lado1 - lado3) || lado3 < (lado1 - lado2) ) {
			System.out.println("Não pode ser formado um triângulo.");
		}
		else if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Forma um triângulo: EQUILÁTERO");
		}
		else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1) {
			System.out.println("Forma um triângulo: ISÓSCELES");
		}
		else if (lado1 != lado2 && lado2 != lado3) {
			System.out.println("Forma um triângulo: ESCALENO");
		}
		
		
		sc.close();

	}

}

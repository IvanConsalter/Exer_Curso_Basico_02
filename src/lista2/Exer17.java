/**
 * FA�A UM PROGRAMA QUE PE�A UM N�MERO CORRESPONDENTE A UM DETERMINADO
 * ANO E EM SEGUIDA INFORME SE ESTE ANO � OU N�O BISSEXTO.
 */
package lista2;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();
		
		if(ano % 400 == 0 || ano % 4 == 0 || ano % 100 != 0) {
			System.out.println(ano + " � Bissexto!");
		}
		else {
			System.out.println(ano + " n�o � Bissexto!");
		}
		
		
		
		sc.close();

	}

}

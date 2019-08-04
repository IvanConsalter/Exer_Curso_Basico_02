/**
 * FAÇA UM PROGRAMA QUE PEÇA UM NÚMERO CORRESPONDENTE A UM DETERMINADO
 * ANO E EM SEGUIDA INFORME SE ESTE ANO É OU NÃO BISSEXTO.
 */
package lista2;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();
		
		if(ano % 400 == 0 || ano % 4 == 0 || ano % 100 != 0) {
			System.out.println(ano + " é Bissexto!");
		}
		else {
			System.out.println(ano + " não é Bissexto!");
		}
		
		
		
		sc.close();

	}

}

/**
 * FA�A UM PROGRAMA QUE PERGUNTE O PRE�O DE TR�S PRODUTOS
 * E INFORME QUAL PRODUTO VOC� DEVE COMPRAR, SABENDO QUE A 
 * DECIS�O � SEMPRE O PRE�O PELO MAIS BARATO.
 */
package lista2;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1� Pre�o: R$ ");
		double preco1 = sc.nextDouble();
		System.out.print("2� Pre�o: R$ ");
		double preco2 = sc.nextDouble();
		System.out.print("3� Pre�o: R$ ");
		double preco3 = sc.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Deve comprar o primeiro produto de (R$ " + preco1 + ")");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Deve comprar o segundo produto de (R$ " + preco2 + ")");
		} else {
			System.out.println("Deve comprar o terceiro produto de (R$ " + preco3 + ")");
		}
		sc.close();
	}

}

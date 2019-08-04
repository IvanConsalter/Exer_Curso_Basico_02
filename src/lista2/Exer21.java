/**
 * UM POSTO ESTÁ VENDENDO COMBUSTÍVEIS COM A SEGUINTE TABELA DE DESCONTOS:
 * 
 * ÁLCOOL:
 * ATÉ 20 LITROS, DESCONTO DE 3% POR LITRO
 * ACIMA DE 20 LITROS, DESCONTODE 5% POR LITRO
 * 
 * GASOLINA:
 * ATÉ 20 LITROS, DESCONTOS DE 4% POR LITRO
 * ACIMA DE 20 LITROS, DESCONTO DE 6% POR LITRO
 * 
 * ESCREVA UM ALGORITMO QUE LEIA O NÚMERO DE LITROS VENDIDOS, O TIPO 
 * DE COMBUSTÍVEL, CALCULE E IMPRIMA O VALOR A SER PAGO PELO CLIENTE
 * SABENDO-SE QUE O PREÇO DO LITRO DA GASOLINA É R$ 2,50 E DO LITRO DO 
 * ÁLCOOL É DE R$ 1,90.
 */
package lista2;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ----------------------------");
		System.out.println("| COD             TIPO       |");
		System.out.println("|  1              ÁLCOOL     |");
		System.out.println("|  2              GASOLINA   |");
		System.out.println(" ---------------------------- ");
		
		System.out.print("Entre com o código:");
		int cod = sc.nextInt();
		System.out.print("Digite a quantidade de litros:");
		double quantidadeLitros = sc.nextDouble();
		
		double precoGasolina = 2.5;
		double precoAlcool = 1.9;
		int desconto;
		double precoTotal;
		double precoComDesconto = 0;
		switch(cod) {
		case 1:
			if (quantidadeLitros <= 20) {
				desconto = 3;
			}
			else {
				desconto = 5;
			}
			precoTotal = quantidadeLitros * precoAlcool;
			precoComDesconto = precoTotal - ((precoTotal/100)*desconto);
		break;
		case 2:
			if (quantidadeLitros <= 20) {
				desconto = 4;
			}
			else {
				desconto = 6;
			}
			precoTotal = quantidadeLitros * precoGasolina;
			precoComDesconto = precoTotal - ((precoTotal/100)*desconto);
		break;
		
		}
		
		System.out.println("Total a pagar: R$" + precoComDesconto);
		
		
		
		
		sc.close();
				

	}

}

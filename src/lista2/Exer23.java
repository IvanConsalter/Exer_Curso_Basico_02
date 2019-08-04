/**
 * O HIPERMERCADO TABAJARA EST� COM UMA PROMO��O DE CARNES
 * QUE � IMPERD�VEL. CONFIRA:
 * 
 *                          AT� 5KG                   ACIMA DE 5KG
 *FILE DUPLO                R$ 5,80 POR KG            4,90 POR KG
 *ALCATRA                   R$ 6,80 POR KG            5,90 POR KG
 *PICANHA                   R$ 7,80 POR KG            6,90 POR KG
 *
 *PARA ATENDER A TODOS OS CLIENTES, CADA CLIENTE PODERPA LEVAR
 *APENAS UM DOS TIPOS DE CARNE. SE COMPRA FOR FEITA NO CART�O
 *TABAJARA O CLIENTE RECEBER� UM DESCONTO DE 5% SOBRE O TOTAL.
 *ESCREVA UM ALGORITMO QUE PE�A O TIPO E A QUANTIDADE DE CARNE 
 *COMPRADA PELO USU�RIO E GERE UM CUPOM FISCAL, CONTENDO AS
 *INFORMA��ES DA COMPRA: TIPO E QUANTIDADE DE CARNE, PRE�O TOTAL,
 *TIPO DE PAGAMENTO, VALOR DO DESCONTO E VALOR A PAGAR.              
 */
package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println(" __________________________");
		System.out.println("| COD      TIPO            |");
		System.out.println("| 1        FILE DUPLO      |");
		System.out.println("| 2        ALCATRA         |");
		System.out.println("| 3        PICANHA         |");
		System.out.println("|__________________________| ");
		
		System.out.print("Entre com o tipo:");
		int codigo = sc.nextInt();
		System.out.println("Entre com a quantidade:");
		double quantidade = sc.nextDouble();
		
		String tipoDeCarne = null;
		double preco = 0;
		double desconto = 0;
		
		switch (codigo) {
		case 1:
			tipoDeCarne = "FILE DUPLO";
			if(quantidade <= 5) {
				preco = 5.8;
			}
			else {
				preco = 4.9;
			}
			break;
		case 2:
			tipoDeCarne = "ALCATRA";
			if(quantidade <= 5) {
				preco = 6.8;
			}
			else {
				preco = 5.9;
			}
			break;
		case 3:
			tipoDeCarne = "PICANHA";
			if(quantidade <= 5) {
				preco = 7.8;
			}
			else {
				preco = 6.9;
			}
			break;
		default:
			System.out.println("C�DIGO INV�LIDO");
		}
		
		double precoTotal = quantidade * preco;
		
		System.out.print("Deseja pagar no cart�o tabajara?(S/N):");
		String resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			desconto = (precoTotal/100)*5;
		}
		
		double totalPagar = precoTotal - desconto;
		
		System.out.println("Tipo de Carne: " + tipoDeCarne);
		System.out.println("Quantidade: " + quantidade + "Kg");
		System.out.println("Pre�o Total: R$" + df.format(precoTotal));
		if(resposta.equalsIgnoreCase("s")) {
			System.out.println("Cart�o Tabajara: Sim");
		}
		else {
			System.out.println("Cart�o Tabajara: N�o");
		}
		System.out.println("Desconto: R$" + df.format(desconto));
		System.out.println("Total a Pagar: R$" + df.format(totalPagar));
		sc.close();
	}

}

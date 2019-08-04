/**
 * UMA FRUTEIRA ESTÁ VENDENDO FRUTAS COM A SEGUINTE TABELA DE PREÇOS:
 * 
 *                   ATÉ 5 KG               ACIMA DE 5KG
 * MORANGO           R$ 2,50 POR KG         R$ 2,20 POR KG
 * MAÇA              R$ 1,80 POR KG         R$ 1,50 POR KG
 * 
 *SE O CLIENTE COMPRAR MAIS DE 8KG EM FRUTAS OU O VALOR TOTAL DA COMPRAR
 * ULTRAPASSAR R$25,00, RECEBERÁ UM DESCONTO DE 10%
 *ESCREVA UM ALGORITMO PARA LER A QUANTIDADE (EM KG) DE MORANGOS E A 
 *QUANTIDADE DE MAÇAS ADQUIRIDAS E ESCREVA O VALOR A SER PAGO PELO CLIENTE. 
 */
package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.print("Quantidade de Morangos(Kg): ");
		double kilosMorangos = sc.nextDouble();

		System.out.print("Quantidade de Maças(Kg): ");
		double kilosMacas = sc.nextDouble();
		
		double totalKilos = kilosMacas + kilosMorangos;
		double totalPagarMorangos = kilosMorangos * 2.5;
		double totalPagarMacas = kilosMacas * 1.8;
		double totalPagar = totalPagarMorangos + totalPagarMacas;
		int porcentagemDesconto;
		
		if(totalKilos > 8 || totalPagar > 25) {
			porcentagemDesconto = 10;
		}
		else {
			porcentagemDesconto = 0;
		}
		
		double desconto = (totalPagar / 100) * porcentagemDesconto;
		double totalComDesconto = totalPagar - desconto;
		
		System.out.println();
		System.out.println(kilosMorangos + "Kg Morangos + " + kilosMacas + "Kg Maças;");
		System.out.println("Total a Pagar: R$" + df.format(totalPagar));
		System.out.println("Desconto: R$" + df.format(desconto));
		System.out.println("Total com Desconto: R$" + df.format(totalComDesconto));
		sc.close();

	}

}

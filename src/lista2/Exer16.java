/**
 * FAÇA UM PROGRAMA QUE CALCULE AS RAÍZES DE UMA EQUÇÃO DO SEGUNDO
 * GRAU, NA FORMA AX^2 + BX + C.
 * O PROGRAMA DEVERÁ PEDIR OS VALORES DE A, B E C E FAZER AS CONSISTÊNCIAS,
 * INFORMANDO AO USUÁRIO NAS SEGUINTES SITUAÇÕES:
 * 
 *1) SE O USUÁRIO INFORMAR O VALOR DE A IGUAL A ZERO, A EQUAÇÃO NÃO É DO 
 *SEGUNDO GRAU E O PROGRAMA NÃO DEVE FAZER PEDIR OS DEMAIS VALORES, SENDO ENCERRADO.
 *2) SE O DELTA CALCULADO FOR NEGATIVO, A EQUAÇÃO NÃO POSSUI RAÍZES REAIS.
 *INFORME AO USUÁRIO E ENCERRE O PROGRAMA.
 *3) SE O DELTA CALCULADO FOR IGUAL A ZERO A EQUAÇÃO POSSUI APENAS UMA RAIZ REAL.
 *INFORME-A AO USUÁRIO.
 *4)SE O DELTA FOR POSITIVO, A EQUAÇÃO POSSUI DUAS RAÍZES REAIS.
 *INFORME-AS AO USUÁRIO.
 */
package lista2;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite valor de (A): ");
		double valorA = sc.nextDouble();
		double valorB = 0;
		double valorC = 0;
		
		if(valorA == 0) {
			System.out.println("Não é uma equação do segundo grau.");
		}
		else {
			System.out.print("Digite valor de (B): ");
			valorB = sc.nextDouble();

			System.out.print("Digite valor de (C): ");
			valorC = sc.nextDouble();
			
			double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
			
			double x1 = (- valorB + Math.sqrt(delta)) / (2 * valorA);

			double x2 = (- valorB - Math.sqrt(delta)) / (2 * valorA);
			
			if(delta < 0 ) {
				System.out.println("A equação não possui raízes reais.");
			}
			else if (delta == 0) {
				System.out.println("A equação possui apenas uma raíz real: " + delta );
			}
			else {
				System.out.println("A equação possui duas raízes reais:");
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);
			}
		}
		
		
		sc.close();
	}

}

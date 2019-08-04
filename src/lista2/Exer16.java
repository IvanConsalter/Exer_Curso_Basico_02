/**
 * FA�A UM PROGRAMA QUE CALCULE AS RA�ZES DE UMA EQU��O DO SEGUNDO
 * GRAU, NA FORMA AX^2 + BX + C.
 * O PROGRAMA DEVER� PEDIR OS VALORES DE A, B E C E FAZER AS CONSIST�NCIAS,
 * INFORMANDO AO USU�RIO NAS SEGUINTES SITUA��ES:
 * 
 *1) SE O USU�RIO INFORMAR O VALOR DE A IGUAL A ZERO, A EQUA��O N�O � DO 
 *SEGUNDO GRAU E O PROGRAMA N�O DEVE FAZER PEDIR OS DEMAIS VALORES, SENDO ENCERRADO.
 *2) SE O DELTA CALCULADO FOR NEGATIVO, A EQUA��O N�O POSSUI RA�ZES REAIS.
 *INFORME AO USU�RIO E ENCERRE O PROGRAMA.
 *3) SE O DELTA CALCULADO FOR IGUAL A ZERO A EQUA��O POSSUI APENAS UMA RAIZ REAL.
 *INFORME-A AO USU�RIO.
 *4)SE O DELTA FOR POSITIVO, A EQUA��O POSSUI DUAS RA�ZES REAIS.
 *INFORME-AS AO USU�RIO.
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
			System.out.println("N�o � uma equa��o do segundo grau.");
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
				System.out.println("A equa��o n�o possui ra�zes reais.");
			}
			else if (delta == 0) {
				System.out.println("A equa��o possui apenas uma ra�z real: " + delta );
			}
			else {
				System.out.println("A equa��o possui duas ra�zes reais:");
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);
			}
		}
		
		
		sc.close();
	}

}

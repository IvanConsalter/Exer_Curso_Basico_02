/**
 * FA�A UM PROGRAMA PARA O C�LCULO DE UMA FOLHA DE PAGAMENTO,
 * SABENDO QUE OS DESCONTOS S�O DO IMPOSTO DE RENDA, QUE DEPENDE DO
 * SAL�RIO BRUTO (CONFORME TABELA ABAIXO) E 3% PARA O SINDICATO E QUE 
 * O FGTS CORRESPONDE A 11% DO SAL�RIO BRUTO, MAS N�O � DESCONTADO 
 * (� A EMPRESA QUE DEPOSITA). O SAL�RIO L�QUIDO CORRESPONDE AO SAL�RIO
 * BRUTO MENOS OS DESCONTOS. O PROGRAMA DEVER� PEDIR AO USU�RIO O VALOR
 * DA SUA HORA E A QUANTIDADE DE HORAS TRABALHADAS NO M�S.
 * 
 * DESCONTO DO IR:
 * SAL�RIO BRUTO AT� 900(INCLUSIVE) - ISENTO;
 * SAL�RIO BRUTO AT� 1500(INCLUSIVE) - DESCONTO DE 5%;
 * SAL�RIO BRUTO AT� 2500(INCLUSIVE) - DESCONTO DE 10%;
 * SAL�RIO BRUTO ACIMA DE 2500 - DESCONTO DE 20%;
 * 
 * IMPRIMA NA TELA AS INFORMA��ES, DISPOSTAS CONFORME O EXEMPLO ABAIXO.
 * NO EXEMPLO O VALOR DA HORA � 5 E A QUANTIDADE DE HORAS � 220.
 * 
 * SAL�RIO BRUTO (5 * 220)  : R$ 1100,00
 * (-) IR (5%)              : R$ 55,00 
 * (-) INSS (10%)           : R$ 110,00
 * FGTS (11%)               : R$ 121,00
 * TOTAL DE DESCONTOS       : R$ 165,00
 * SAL�RIO L�QUIDO          : R$ 935,00
 */
package lista2;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor da Hora: R$");
		double valorHora = sc.nextDouble();
		System.out.print("Quantidade horas trabalhadas: ");
		double quantidadeHoras = sc.nextDouble();
		
		double salarioBruto = valorHora*quantidadeHoras;
		int descontoIR;
		if(salarioBruto <= 900) {
			descontoIR = 0;
		}
		else if(salarioBruto > 900 || salarioBruto <= 1500) {
			descontoIR = 5;
		}
		else if(salarioBruto > 1500 || salarioBruto <= 2500) {
			descontoIR = 10;
		}
		else {
			descontoIR = 20;
		}
		
		double impostoIR = (salarioBruto/100)*descontoIR;
		double inss = (salarioBruto/100)*10;
		double fgts = (salarioBruto/100)*11;
		double descontos = impostoIR + inss;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Sal�rio Bruto (" + valorHora + " * " + quantidadeHoras + "): R$" + salarioBruto);
		System.out.println("Imposto Renda: R$" + impostoIR);
		System.out.println("INSS: R$" + inss);
		System.out.println("FGTS: R$" + fgts);
		System.out.println("Total de Descontos: R$" + descontos);
		System.out.println("Sal�rio L�quido: R$" + salarioLiquido);
		
		
		sc.close();
	}

}

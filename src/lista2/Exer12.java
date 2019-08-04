/**
 * FAÇA UM PROGRAMA PARA O CÁLCULO DE UMA FOLHA DE PAGAMENTO,
 * SABENDO QUE OS DESCONTOS SÃO DO IMPOSTO DE RENDA, QUE DEPENDE DO
 * SALÁRIO BRUTO (CONFORME TABELA ABAIXO) E 3% PARA O SINDICATO E QUE 
 * O FGTS CORRESPONDE A 11% DO SALÁRIO BRUTO, MAS NÃO É DESCONTADO 
 * (É A EMPRESA QUE DEPOSITA). O SALÁRIO LÍQUIDO CORRESPONDE AO SALÁRIO
 * BRUTO MENOS OS DESCONTOS. O PROGRAMA DEVERÁ PEDIR AO USUÁRIO O VALOR
 * DA SUA HORA E A QUANTIDADE DE HORAS TRABALHADAS NO MÊS.
 * 
 * DESCONTO DO IR:
 * SALÁRIO BRUTO ATÉ 900(INCLUSIVE) - ISENTO;
 * SALÁRIO BRUTO ATÉ 1500(INCLUSIVE) - DESCONTO DE 5%;
 * SALÁRIO BRUTO ATÉ 2500(INCLUSIVE) - DESCONTO DE 10%;
 * SALÁRIO BRUTO ACIMA DE 2500 - DESCONTO DE 20%;
 * 
 * IMPRIMA NA TELA AS INFORMAÇÕES, DISPOSTAS CONFORME O EXEMPLO ABAIXO.
 * NO EXEMPLO O VALOR DA HORA É 5 E A QUANTIDADE DE HORAS É 220.
 * 
 * SALÁRIO BRUTO (5 * 220)  : R$ 1100,00
 * (-) IR (5%)              : R$ 55,00 
 * (-) INSS (10%)           : R$ 110,00
 * FGTS (11%)               : R$ 121,00
 * TOTAL DE DESCONTOS       : R$ 165,00
 * SALÁRIO LÍQUIDO          : R$ 935,00
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
		
		System.out.println("Salário Bruto (" + valorHora + " * " + quantidadeHoras + "): R$" + salarioBruto);
		System.out.println("Imposto Renda: R$" + impostoIR);
		System.out.println("INSS: R$" + inss);
		System.out.println("FGTS: R$" + fgts);
		System.out.println("Total de Descontos: R$" + descontos);
		System.out.println("Salário Líquido: R$" + salarioLiquido);
		
		
		sc.close();
	}

}

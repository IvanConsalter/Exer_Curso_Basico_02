/**
 * AS ORGANIZA��ES TABAJARA RESOLVERAM DAR UM AUMENTO DE SAL�RIO
 * AOS SEUS COLABORADORES E LHE CONTRATARAM PARA DESENVOLVER O 
 * PROGRAMA QUE CALCULAR� OS REAJUSTES.
 * 
 * FA�A UM PROGRAMA QUE RECEBE O SAL�RIO DE UM COLABORADOR E
 * O REAJUSTE SEGUNDO O SEGUINTE CRIT�RIO, BASEADO NO SAL�RIO ATUAL:
 * 
 * SAL�RIOS AT� R$ 280,00 (INCLUINDO): AUMENTO DE 20%;
 * SAL�RIOS ENTRE R$280,00 E R$ 700,00 : AUMENTO DE 15%
 * SAL�RIOS ENTRE R$700,00 E R$1500,00 : AUMENTO DE 10%
 * SAL�RIOS ACIMA DE R$1500,00 : AUMENTO DE 5%
 * 
 * AP�S O AUMENTO SER REALIZADO, INFORME NA TELA:
 * 
 * O SAL�RIO ANTES DO REAJUSTE;
 * O PERCENTUAL DE AUMENTO APLICADO;
 * O VALOR DO AUMENTO;
 * O NOVO SAL�RIO, AP�S O AUMENTO.
 */
package lista2;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o sal�rio: R$");
		double salario = sc.nextDouble();
		
		int porcentagem = 0;
		
		if(salario <= 280) {
			porcentagem = 20;
		}
		else if(salario > 280 && salario <= 700) {
			porcentagem = 15;
		}
		else if(salario > 700 && salario <= 1500) {
			porcentagem = 10;
		}
		else {
			porcentagem = 5;
		}
		
		double valorAumento = (salario/100)*porcentagem;
		double novoSalario = salario + valorAumento;
		
		System.out.println("Antigo Sal�rio: R$" + salario);
		System.out.println("Percentual Aplicado: " + porcentagem + "%");
		System.out.println("Valor do Aumento: R$" + valorAumento);
		System.out.println("Novo Sal�rio: R$" + novoSalario);
		
		sc.close();

	}

}

/**
 * AS ORGANIZAÇÕES TABAJARA RESOLVERAM DAR UM AUMENTO DE SALÁRIO
 * AOS SEUS COLABORADORES E LHE CONTRATARAM PARA DESENVOLVER O 
 * PROGRAMA QUE CALCULARÁ OS REAJUSTES.
 * 
 * FAÇA UM PROGRAMA QUE RECEBE O SALÁRIO DE UM COLABORADOR E
 * O REAJUSTE SEGUNDO O SEGUINTE CRITÉRIO, BASEADO NO SALÁRIO ATUAL:
 * 
 * SALÁRIOS ATÉ R$ 280,00 (INCLUINDO): AUMENTO DE 20%;
 * SALÁRIOS ENTRE R$280,00 E R$ 700,00 : AUMENTO DE 15%
 * SALÁRIOS ENTRE R$700,00 E R$1500,00 : AUMENTO DE 10%
 * SALÁRIOS ACIMA DE R$1500,00 : AUMENTO DE 5%
 * 
 * APÓS O AUMENTO SER REALIZADO, INFORME NA TELA:
 * 
 * O SALÁRIO ANTES DO REAJUSTE;
 * O PERCENTUAL DE AUMENTO APLICADO;
 * O VALOR DO AUMENTO;
 * O NOVO SALÁRIO, APÓS O AUMENTO.
 */
package lista2;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o salário: R$");
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
		
		System.out.println("Antigo Salário: R$" + salario);
		System.out.println("Percentual Aplicado: " + porcentagem + "%");
		System.out.println("Valor do Aumento: R$" + valorAumento);
		System.out.println("Novo Salário: R$" + novoSalario);
		
		sc.close();

	}

}

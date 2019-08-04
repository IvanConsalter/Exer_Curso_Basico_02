/**
 * FA�A UM PROGRAMA PARA A LEITURA DE DUAS NOTAS PARCIAIS DE UM ALUNO.
 * O PROGRAMA DEVE CALCULAR A M�DIA ALCAN�ADA POR ALUNO E APRESENTAR:
 * "APROVADO", SE A M�DIA FOR MAIOR OU IGUAL A SETE;
 * "REPROVADO", SE A M�DIA FOR MENOR DO QUE SETE;
 * "APROVADO COM DISTIN��O", SE A M�DIA FOR IGUAL A DEZ;
 */
package lista2;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1� Nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("2� Nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("M�dia:" + media);
			System.out.println("APROVADO COM DISTIN��O");
		}
		else if(media >= 7){
			System.out.println("M�dia:" + media);
			System.out.println("APROVADO");
		}
		else {
			System.out.println("M�dia:" + media);
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}

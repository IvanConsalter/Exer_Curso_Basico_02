/**
 * FAÇA UM PROGRAMA PARA A LEITURA DE DUAS NOTAS PARCIAIS DE UM ALUNO.
 * O PROGRAMA DEVE CALCULAR A MÉDIA ALCANÇADA POR ALUNO E APRESENTAR:
 * "APROVADO", SE A MÉDIA FOR MAIOR OU IGUAL A SETE;
 * "REPROVADO", SE A MÉDIA FOR MENOR DO QUE SETE;
 * "APROVADO COM DISTINÇÃO", SE A MÉDIA FOR IGUAL A DEZ;
 */
package lista2;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1ª Nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("2ª Nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("Média:" + media);
			System.out.println("APROVADO COM DISTINÇÃO");
		}
		else if(media >= 7){
			System.out.println("Média:" + media);
			System.out.println("APROVADO");
		}
		else {
			System.out.println("Média:" + media);
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}

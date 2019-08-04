/**
 * FAÇA UM PROGRAMA QUE LÊ AS DUAS NOTAS PARCIAIS OBTIDAS
 * POR UM ALUNO NUMA DISCIPLINA AO LONGO DE UM SEMESTRE, E CALCULE A SUA MÉDIA.
 * A ATRIBUIÇÃO DE CONCEITOS OBEDECE Á TABELA ABAIXO:
 * 
 * MÉDIA DE APROVEITAMENTO         CONCEITO
 * ENTRE 9.0 E 10.0                A
 * ENTRE 7.5 E 9.0                 B
 * ENTRE 6.0 E 7.5                 C
 * ENTRE 4.0 E 6.0                 D
 * ENTRE 4.0 E ZERO                E
 * 
 * O ALGORITMO DEVE MOSTRAR NA TELA AS NOTAS, A MÉDIA, 
 * O CONCEITO CORRESPONDENTE E A MENSAGEM "APROVADO" SE 
 * O CONCEITO FOR (A, B OU C) E "REPROVADO" SE CONCEITO FOR (D OU E)
 */
package lista2;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1ª Nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("2ª Nota: ");
		double nota2 = sc.nextDouble();
		System.out.println();
		System.out.println();
		
		double media = (nota1 + nota2)/2;
		
		
		if(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			System.out.println("Notas tem que ser entre 0 e 10;");
		}
		else if(media >= 9 && media <= 10) {
			System.out.println("1ª Nota:" + nota1);
			System.out.println("2ª Nota:" + nota2);
			System.out.println("Média:" + media);
			System.out.println("Conceito: A");
			System.out.println("APROVADO");
		}
		else if(media >= 7.5 && media < 9) {
			System.out.println("1ª Nota:" + nota1);
			System.out.println("2ª Nota:" + nota2);
			System.out.println("Média:" + media);
			System.out.println("Conceito: B");
			System.out.println("APROVADO");
		}
		else if(media >= 6 && media < 7.5) {
			System.out.println("1ª Nota:" + nota1);
			System.out.println("2ª Nota:" + nota2);
			System.out.println("Média:" + media);
			System.out.println("Conceito: C");
			System.out.println("APROVADO");
		}
		else if(media >= 4 && media < 6) {
			System.out.println("1ª Nota:" + nota1);
			System.out.println("2ª Nota:" + nota2);
			System.out.println("Média:" + media);
			System.out.println("Conceito: D");
			System.out.println("REPROVADO");
		}
		else {
			System.out.println("1ª Nota:" + nota1);
			System.out.println("2ª Nota:" + nota2);
			System.out.println("Média:" + media);
			System.out.println("Conceito: E");
			System.out.println("REPROVADO");
		}
		sc.close();
		
		
	}

}

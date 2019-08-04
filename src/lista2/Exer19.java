/**
 * FAÇA UM PROGRAMA QUE LEIA DOIS NÚMEROS E EM SEGUIDA PERGUNTE
 * AO USUÁRIO QUAL OPERAÇÃO ELE DESEJA REALIZAR. O RESULTADO DA OPERAÇÃO
 * DEVE SER ACOMPANHADO DE UMA FRASE QUE DIGA SE O NÚMERO É:
 * 
 * 1)PAR OU ÍMPAR;
 * 2)POSITIVO OU NEGATIVO;
 */
package lista2;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1° número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Escolha a operação (+) (-) (*) (/)");
		String operacao = sc.next();
		System.out.print("2° número: ");
		double numero2 = sc.nextDouble();

		double resultado = 0;
		String parOuImpar;
		String positivoOuNegativo;
		boolean verdadeiro = true;
		
		switch (operacao) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "*":
			resultado = numero1 * numero2;
			break;
		case "/":
			resultado = numero1 / numero2;
			break;
		default:
			System.out.println("OPERAÇÃO INVÁLIDA");
			verdadeiro = false;
		}
		
		
		if(verdadeiro) {
		if(resultado % 2 == 0) {
			parOuImpar = "PAR";
		}
		else {
			parOuImpar = "ÍMPAR";	
		}
		
		if(resultado < 0) {
			positivoOuNegativo = "NEGATIVO";
		}
		else {
			positivoOuNegativo = "POSITIVO";
		}
		
		System.out.println("Resultado = " + resultado + " é " + parOuImpar + " e é " + positivoOuNegativo);
		}
		
		
		sc.close();

	}

}

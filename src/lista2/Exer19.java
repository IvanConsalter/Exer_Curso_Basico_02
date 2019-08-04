/**
 * FA�A UM PROGRAMA QUE LEIA DOIS N�MEROS E EM SEGUIDA PERGUNTE
 * AO USU�RIO QUAL OPERA��O ELE DESEJA REALIZAR. O RESULTADO DA OPERA��O
 * DEVE SER ACOMPANHADO DE UMA FRASE QUE DIGA SE O N�MERO �:
 * 
 * 1)PAR OU �MPAR;
 * 2)POSITIVO OU NEGATIVO;
 */
package lista2;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1� n�mero: ");
		double numero1 = sc.nextDouble();
		System.out.println("Escolha a opera��o (+) (-) (*) (/)");
		String operacao = sc.next();
		System.out.print("2� n�mero: ");
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
			System.out.println("OPERA��O INV�LIDA");
			verdadeiro = false;
		}
		
		
		if(verdadeiro) {
		if(resultado % 2 == 0) {
			parOuImpar = "PAR";
		}
		else {
			parOuImpar = "�MPAR";	
		}
		
		if(resultado < 0) {
			positivoOuNegativo = "NEGATIVO";
		}
		else {
			positivoOuNegativo = "POSITIVO";
		}
		
		System.out.println("Resultado = " + resultado + " � " + parOuImpar + " e � " + positivoOuNegativo);
		}
		
		
		sc.close();

	}

}

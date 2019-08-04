/**
 * FA�A UM PROGRAMA QUE FA�A 5 PERGUNTAS PARA UMA PESSOA SOBRE
 * UM CRIME. AS PERGUNTAS S�O:
 * 
 * 1- "TELEFONOU PARA A V�TIMA?"
 * 2- "ESTEVE NO LOCAL DO CRIME?"
 * 3- "MORA PERTO DA V�TIMA?"
 * 4- "DEVIA PARA A V�TIMA?"
 * 5- "J� TRABALHOU COM A V�TIMA?"
 * 
 * O PROGRAMA DEVE NO FINAL EMITIR UMA CLASSIFICA��O SOBRE A PARTICIPA��O
 * DA PESSOA NO CRIME. SE A PESSOA RESPONDER POSITIVAMENTE A 2 QUEST�ES 
 * ELA DEVE SER CLASSIFICADA COMO "SUSPEITA", ENTRE 3 E 4 COMO "C�MPLICE"
 * E 5 COMO "ASSASSINO". CASO CONTR�RIO, SER� CLASSIFICADO COMO "INOCENTE"
 */
package lista2;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int juiz = 0;
		String resposta;
		
		System.out.println("TELEFONOU PARA A V�TIMA?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1;  
		} 
		
		System.out.println("ESTEVE NO LOCAL DO CRIME?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1;  
		} 
							
		System.out.println("MORA PERTO DA V�TIMA?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1;  
		}
		
		System.out.println("DEVIA PARA A V�TIMA?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1; 
		}
		
		System.out.println("J� TRABALHOU COM A V�TIMA?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1; 
		}
		
		System.out.println();
		System.out.println();
		if (juiz == 2) {
			System.out.println("SUSPEITO");
		}
		else if (juiz == 3 || juiz == 4) {
			System.out.println("C�MPLICE");
		}
		else if (juiz == 5) {
			System.out.println("ASSASSINO");
		}
		else {
			System.out.println("INOCENTE");
		}
		
		
		sc.close();

	}

}

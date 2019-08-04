/**
 * FAÇA UM PROGRAMA QUE FAÇA 5 PERGUNTAS PARA UMA PESSOA SOBRE
 * UM CRIME. AS PERGUNTAS SÃO:
 * 
 * 1- "TELEFONOU PARA A VÍTIMA?"
 * 2- "ESTEVE NO LOCAL DO CRIME?"
 * 3- "MORA PERTO DA VÍTIMA?"
 * 4- "DEVIA PARA A VÍTIMA?"
 * 5- "JÁ TRABALHOU COM A VÍTIMA?"
 * 
 * O PROGRAMA DEVE NO FINAL EMITIR UMA CLASSIFICAÇÃO SOBRE A PARTICIPAÇÃO
 * DA PESSOA NO CRIME. SE A PESSOA RESPONDER POSITIVAMENTE A 2 QUESTÕES 
 * ELA DEVE SER CLASSIFICADA COMO "SUSPEITA", ENTRE 3 E 4 COMO "CÚMPLICE"
 * E 5 COMO "ASSASSINO". CASO CONTRÁRIO, SERÁ CLASSIFICADO COMO "INOCENTE"
 */
package lista2;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int juiz = 0;
		String resposta;
		
		System.out.println("TELEFONOU PARA A VÍTIMA?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1;  
		} 
		
		System.out.println("ESTEVE NO LOCAL DO CRIME?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1;  
		} 
							
		System.out.println("MORA PERTO DA VÍTIMA?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1;  
		}
		
		System.out.println("DEVIA PARA A VÍTIMA?(S/N):");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("s")) {
			juiz += 1; 
		}
		
		System.out.println("JÁ TRABALHOU COM A VÍTIMA?(S/N):");
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
			System.out.println("CÚMPLICE");
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

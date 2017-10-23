package siger.capitulo2;

import java.util.Scanner;

// Exercicio 2.16
// Lê 2 inteiros e verifica qual é maior 
public class Maior {
	
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		numero1 = scanner.nextInt();
		System.out.println("Digite outro número inteiro:");
		numero2 = scanner.nextInt();
			
		if(numero1 > numero2) {
			System.out.println(numero1 + " is larger");
		} else if(numero2 > numero1) {
			System.out.println(numero2 + " is larger");
		} else {
			System.out.println("These number as equal.");
		}
		
	}

}

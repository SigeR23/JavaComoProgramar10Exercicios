package siger.capitulo2;

import java.util.Scanner;

// Exercicio 2.16
// L� 2 inteiros e verifica qual � maior 
public class Maior {
	
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro:");
		numero1 = scanner.nextInt();
		System.out.println("Digite outro n�mero inteiro:");
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

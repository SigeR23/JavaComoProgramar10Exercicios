package siger.capitulo2;

import java.util.Scanner;

//ex 2.25
//ler um número inteiro e determinar se é impar ou par

public class ParOuImpar {
	public static void main(String[] args) {
		
		int numero;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " é par");
		} else {
			System.out.println(numero + " é impar");
		}
		
	}
}

package siger.capitulo2;

import java.util.Scanner;

//ex 2.25
//ler um n�mero inteiro e determinar se � impar ou par

public class ParOuImpar {
	public static void main(String[] args) {
		
		int numero;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro:");
		numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � par");
		} else {
			System.out.println(numero + " � impar");
		}
		
	}
}

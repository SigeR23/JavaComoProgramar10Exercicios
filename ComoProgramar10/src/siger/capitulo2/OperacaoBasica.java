package siger.capitulo2;

import java.util.Scanner;

//Exercicio 2.15
// Le 2 valores e retorna o resultada da soma, subtração, multiplicação e divisão desses valores

public class OperacaoBasica {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		x = input.nextInt();
		System.out.println("Digite outro número inteiro:");
		y = input.nextInt();
		
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
	}
	
	
}

package siger.capitulo2;

import java.util.Scanner;

//Exercicio 2.15
// Le 2 valores e retorna o resultada da soma, subtra��o, multiplica��o e divis�o desses valores

public class OperacaoBasica {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		x = input.nextInt();
		System.out.println("Digite outro n�mero inteiro:");
		y = input.nextInt();
		
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
	}
	
	
}

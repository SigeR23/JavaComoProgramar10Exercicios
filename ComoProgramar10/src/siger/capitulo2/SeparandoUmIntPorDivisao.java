package siger.capitulo2;

import java.util.Scanner;

//Ex 2.30
//ler um int de 5 dig e separar e imprimir cada digito
public class SeparandoUmIntPorDivisao {
	
	public static void main(String[] args) {
		int d1;
		int d2;
		int d3;
		int d4;
		int d5;
		int numero;
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Digite um número com 5 digitos");
		numero = scanner.nextInt();
		
		d5 = numero % 10;
		numero /= 10;
		
		d4 = numero % 10;
		numero /= 10;
		
		d3 = numero % 10;
		numero /= 10;
		
		d2 = numero % 10;
		numero /= 10;
		
		d1 = numero % 10;
		numero /= 10;
		
		System.out.println(d1 + "   " + d2 +  "   " + d3 + "   " + d4 + "   " + d5);
		
	}
}

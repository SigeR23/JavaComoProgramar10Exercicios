package siger.capitulo2;

import java.util.Scanner;

//Ex 2.32
//Ler 5 valores imprimir quantos são positivos/negativos/zero
public class ContarPositivosNegativosZeros {
	public static void main(String[] args) {
		
		int numero;
		int positivos = 0;
		int negativos = 0;
		int zeros = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o 1° número");
		numero = scanner.nextInt();
		
		if(numero > 0) {
			positivos++;
		} else if(numero < 0) {
			negativos++;
		} else {
			zeros++;
		}
		
		System.out.println("Digite o 2° número");
		numero = scanner.nextInt();
		
		if(numero > 0) {
			positivos++;
		} else if(numero < 0) {
			negativos++;
		} else {
			zeros++;
		}
		
		System.out.println("Digite o 3° número");
		numero = scanner.nextInt();
		
		if(numero > 0) {
			positivos++;
		} else if(numero < 0) {
			negativos++;
		} else {
			zeros++;
		}
		
		System.out.println("Digite o 4° número");
		numero = scanner.nextInt();
		
		if(numero > 0) {
			positivos++;
		} else if(numero < 0) {
			negativos++;
		} else {
			zeros++;
		}
		
		System.out.println("Digite o 5° número");
		numero = scanner.nextInt();
		
		if(numero > 0) {
			positivos++;
		} else if(numero < 0) {
			negativos++;
		} else {
			zeros++;
		}
		
		System.out.println(positivos + " positivos\t" + negativos + " negativos\t" + zeros + " zeros");
	}
}

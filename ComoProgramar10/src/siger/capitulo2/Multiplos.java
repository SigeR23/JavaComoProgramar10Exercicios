package siger.capitulo2;

import java.util.Scanner;

// Ex 2.26
// ler 2 numeros inteiros, verificar se são multiplos entre si e imprimir o quociente 
public class Multiplos {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro número inteiro");
		numero2 = scanner.nextInt();
		
		if(numero1 % numero2 == 0) {
			System.out.println(numero1 + ", " + numero2 + " são Multiplos: " + numero1/numero2);
		} else {
			System.out.println(numero1 + ", " + numero2 + " não são Multiplos: " + numero1/numero2);
		}
	}
}

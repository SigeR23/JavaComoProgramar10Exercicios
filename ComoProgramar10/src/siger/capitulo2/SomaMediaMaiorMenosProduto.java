package siger.capitulo2;

import java.util.Scanner;

// Exercicio 2.17
// L� 3 numeros inteiros e calcula, soma, m�dia(int), produto, maior e menor
public class SomaMediaMaiorMenosProduto {
	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int maior;
		int menor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		n1 = input.nextInt();
		maior = n1;
		menor = n1;
		System.out.println("Digite outro n�mero inteiro:");
		n2 = input.nextInt();
		maior = (n2 > maior) ? n2 : maior;
		menor = (n2 > maior) ? n2 : menor;
		
		System.out.println("Digite mais um n�mero inteiro:");
		n3 = input.nextInt();
		maior = (n3 > maior) ? n3 : maior;
		menor = (n3 > maior) ? n3 : menor;
		
		System.out.println("Soma: " + (n1 + n2 + n3));
		System.out.println("M�dia: " + (n1 + n2 + n3)/3);
		System.out.println("Produto: " +  (n1 * n2 * n3));
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
	
	}
}

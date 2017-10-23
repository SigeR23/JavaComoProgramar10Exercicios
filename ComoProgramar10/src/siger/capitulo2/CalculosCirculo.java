package siger.capitulo2;

import java.util.Scanner;

//Ex 2.28

// Ler um inteiro(Raio) calcular Diametro, Circunferência e Área a partir desse valor
public class CalculosCirculo {
	public static void main(String[] args) {
		int raio;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio");
		raio = scanner.nextInt();
		
		System.out.println("Diamentro = " + 2 * raio);
		System.out.println("Circunferência = " + 2 * Math.PI * raio);
		System.out.println("Área = " + Math.PI * Math.pow(raio, 2));
	}	
}

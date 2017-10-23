package siger.capitulo2;

import java.util.Scanner;

//Ex 2.33
// Calcular imc
public class IndiceDeMassaCorporal {
	public static void main(String[] args) {
		
		float pesoEmKg;
		float alturaEmMetros;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu peso");
		pesoEmKg = scanner.nextFloat();
		
		System.out.println("Digite sua Altura");
		alturaEmMetros = scanner.nextFloat();
		
		System.out.println("Seu IMC é: " + (pesoEmKg/Math.pow(alturaEmMetros, 2)));
	
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: \tless than 18.5");
		System.out.println("Normal: \tbetween 18.5 and 24.9");
		System.out.println("Overweight: \tbetween 25 and 29.9");
		System.out.println("Obese: \t\t30 or greater");
	}
}

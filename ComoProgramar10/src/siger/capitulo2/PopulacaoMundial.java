package siger.capitulo2;
//Ex 3.34
//Calcular popula��o mundial extimada para daqui a 1, 2, 3, 4 e 5 anos.

public class PopulacaoMundial {
	public static void main(String[] args) {
		double populacaoMundialAtual = 7.6; //bilhoes
		double taxaCrescimentoAnual = 0.083;
		System.out.println("Popula��o mundial atual: " + populacaoMundialAtual);
		System.out.println("Popula��o daqui 1 ano: " + (populacaoMundialAtual + taxaCrescimentoAnual));
		System.out.println("Popula��o daqui 2 anos: " + (populacaoMundialAtual + taxaCrescimentoAnual * 2));
		System.out.println("Popula��o daqui 3 anos: " + (populacaoMundialAtual + taxaCrescimentoAnual * 3));
		System.out.println("Popula��o daqui 4 anos: " + (populacaoMundialAtual + taxaCrescimentoAnual * 4));
		System.out.println("Popula��o daqui 5 anos: " + (populacaoMundialAtual + taxaCrescimentoAnual * 5));
		
	}
}

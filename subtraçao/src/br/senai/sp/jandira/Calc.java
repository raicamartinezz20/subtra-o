package br.senai.sp.jandira;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int primeiroValor, segundoValor;
		
		System.out.println("***********************************");
		System.out.println("           SUBTRAÇÃO");
		System.out.println("***********************************");
		
		System.out.print("Valor 1? ");
		primeiroValor = teclado.nextInt();
		
		System.out.print("Valor 2? ");
		segundoValor = teclado.nextInt();
		
		
		if (primeiroValor > segundoValor) {
			System.out.println(primeiroValor - segundoValor);
			} else {
				System.out.println(segundoValor - primeiroValor);
			}
	}
}

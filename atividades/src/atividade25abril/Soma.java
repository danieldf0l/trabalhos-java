package atividade25abril;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o 1� n�mero: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o 2� n�mero: ");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o 3� n�mero: ");
		int numero3 = teclado.nextInt();
		System.out.println("Digite o 4� n�mero: ");
		int numero4 = teclado.nextInt();
		int soma = numero1 + numero2 +numero3 + numero4;
		System.out.println("A soma de todos numeros digitados � : " + soma);
		teclado.close();

	}

}

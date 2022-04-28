package atividade25abril;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o 1º número: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o 2º número: ");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o 3º número: ");
		int numero3 = teclado.nextInt();
		System.out.println("Digite o 4º número: ");
		int numero4 = teclado.nextInt();
		int soma = numero1 + numero2 +numero3 + numero4;
		System.out.println("A soma de todos numeros digitados é : " + soma);
		teclado.close();

	}

}

package atividade25abril;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Digite o 1� numero: ");
		int numero1 = teclado.nextInt();
		System.out.print("Digite o 2� numero: ");
		int numero2 = teclado.nextInt();
		System.out.print(numero1 * numero2);
		teclado.close();
	}

}

package atividade25abril;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o 1º numero: ");
		float numero1 = teclado.nextFloat();
		System.out.println("Digite o 2º numero: ");
		float numero2 = teclado.nextFloat();
		System.out.println("Digite o 3º numero: ");
		float numero3 = teclado.nextFloat();
		float media = (numero1 + numero2 + numero3) / 3;
		System.out.println("A média desses números é: " + media);
		teclado.close();
	}

}

package atividade25abril;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o 1� numero: ");
		float numero1 = teclado.nextFloat();
		System.out.println("Digite o 2� numero: ");
		float numero2 = teclado.nextFloat();
		System.out.println("Digite o 3� numero: ");
		float numero3 = teclado.nextFloat();
		float media = (numero1 + numero2 + numero3) / 3;
		System.out.println("A m�dia desses n�meros �: " + media);
		teclado.close();
	}

}

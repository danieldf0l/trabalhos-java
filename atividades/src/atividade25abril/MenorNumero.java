package atividade25abril;

import java.util.Scanner;

public class MenorNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o 1º numero: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o 2º numero: ");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o 3º numero: ");
		int numero3 = teclado.nextInt();
		System.out.println("Digite o 4º numero: ");
		int numero4 = teclado.nextInt();
		int menor = 0; 
		if (numero1<numero2 && numero1<numero3 && numero1<numero4) {
			menor = numero1;
		} else if (numero2<numero1 && numero2<numero3 && numero2<numero4) {
			menor = numero2;
		} else if (numero3<numero1 && numero3<numero2 && numero3<numero4) {
			menor = numero3;
		} else {
			menor = numero4;
		}
		System.out.println("O menor número inserido é: " + menor);
		teclado.close();

	}

}

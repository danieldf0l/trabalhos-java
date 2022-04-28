package atividade25abril;

import java.util.Scanner;

public class Aprovacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a 1º nota: ");
		Float nota1 = teclado.nextFloat();
		System.out.println("Digite a 2º nota: ");
		Float nota2 = teclado.nextFloat();
		Float media = (nota1 + nota2)/2; 
		if (media >= 6 ) {
			System.out.println("Parabéns, você foi APROVADO com uma média de: " + media);
		}
		else {
			System.out.println("infelizmente você está REPROVADO com uma média de: " + media);
		}
		teclado.close();
	}

}

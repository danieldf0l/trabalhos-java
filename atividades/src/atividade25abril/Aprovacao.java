package atividade25abril;

import java.util.Scanner;

public class Aprovacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a 1� nota: ");
		Float nota1 = teclado.nextFloat();
		System.out.println("Digite a 2� nota: ");
		Float nota2 = teclado.nextFloat();
		Float media = (nota1 + nota2)/2; 
		if (media >= 6 ) {
			System.out.println("Parab�ns, voc� foi APROVADO com uma m�dia de: " + media);
		}
		else {
			System.out.println("infelizmente voc� est� REPROVADO com uma m�dia de: " + media);
		}
		teclado.close();
	}

}

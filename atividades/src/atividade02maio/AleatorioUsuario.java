package atividade02maio;

import java.util.Scanner;
import java.util.Random;

public class AleatorioUsuario {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner input = new Scanner (System.in);
		System.out.println("Digite o valor m�nimo para ser sorteado: ");
		int minimo =  input.nextInt();
		System.out.println("Digite o valor m�ximo a ser sorteado: ");
		int maximo = input.nextInt();
		int sorteado = minimo + aleatorio.nextInt((maximo - minimo) + 1);
		System.out.println("O n�mero sorteado foi: " + sorteado);
		input.close();
	}

}

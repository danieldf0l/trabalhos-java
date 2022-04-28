package atividade25abril;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Digite o seu nome: ");
		String nome = teclado.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = teclado.nextLine();
		System.out.print(sobrenome + ", " + nome);
		teclado.close();
	}

}

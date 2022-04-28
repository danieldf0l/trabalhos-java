package atividade25abril;

import java.util.Scanner;

public class MaiorIdade {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.next();
		System.out.println("Digite seu ano de nascimento");
		int anoNascimento = teclado.nextInt();
		int idade = 2022 - anoNascimento;
		if (idade > 18) {
			System.out.println(nome + "voce já é maior de idade. tem " + idade + " anos");
		}
		else {
			System.out.println(nome + "voce ainda não tem 18 anos, mas sim, " + idade + " anos");
		}
		teclado.close();
	}
	
}
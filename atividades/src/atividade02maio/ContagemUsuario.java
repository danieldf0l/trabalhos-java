package atividade02maio;

import java.util.Scanner;

public class ContagemUsuario {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Insira o valor que deve iniciar a contagem: ");
		int inicio = input.nextInt();
		System.out.println("Insira o �ltimo n�mero que deve pariticpar da contagem: ");
		int fim = input.nextInt();
		input.close();
		System.out.println("\ncontagem:");
		for (;inicio<=fim;++inicio) {
			System.out.println(inicio);
		}

	}

}

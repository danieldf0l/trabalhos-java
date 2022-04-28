package atividade25abril;

import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in); 
		System.out.println("Digite o valor do produto: ");
		 Float preço = teclado.nextFloat();
		System.out.println("Digite a quantidade comprada: ");
		int quantidade = teclado.nextInt();
		System.out.println("Digite a % de desconto: ");
		int desconto = teclado.nextInt();
		Float novoPreço = (preço - (preço * desconto / 100)) * quantidade;
		System.out.println("O novo valor do produto é: R$" + novoPreço);
		teclado.close();

	}

}

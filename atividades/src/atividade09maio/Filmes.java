package atividade09maio;

import java.util.Scanner;

public class Filmes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] filmes = new String [10];
		System.out.println("Digite seu 10 filmes preferidos: ");
		filmes [0] = input.nextLine();
		filmes [1] = input.nextLine();
		filmes [2] = input.nextLine();
		filmes [3] = input.nextLine();
		filmes [4] = input.nextLine();
		filmes [5] = input.nextLine();
		filmes [6] = input.nextLine();
		filmes [7] = input.nextLine();
		filmes [8] = input.nextLine();
		filmes [9] = input.nextLine();
		for (int i = 0; i < 10; i++) {
			System.out.println(filmes[i]);
		input.close();
	}

}
}
package atividade09maio;

import java.util.Scanner;

public class Musica {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String [] musicas = new String [5];
		System.out.println("Digite suas 5 músicas favoritas: ");
		musicas[0] = input.nextLine();
		musicas[1] = input.nextLine();
		musicas[2] = input.nextLine();
		musicas[3] = input.nextLine();
		musicas[4] = input.nextLine();
		for (int i = 0; i < 5; i++) {
			System.out.println(musicas[i]);
			input.close();
	}

}
}
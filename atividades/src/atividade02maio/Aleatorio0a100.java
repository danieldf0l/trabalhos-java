package atividade02maio;

import java.util.Random;

public class Aleatorio0a100 {

	public static void main(String[] args) {
		Random sorteador = new Random();
		int sorteado = sorteador.nextInt(101) ;
		System.out.println("O número Sorteado foi: " + sorteado);

	}

}

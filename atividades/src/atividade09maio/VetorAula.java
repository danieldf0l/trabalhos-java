package atividade09maio;

public class VetorAula {

	public static void main(String[] args) {
		String semana [] = new String [7];
		
		semana [0] = "Domingo";
		semana [1] = "Segunda";
		semana [2] = "Terça";
		semana [3] = "Quarta";
		semana [4] = "Quinta";
		semana [5] = "Sexta";
		semana [6] = "Sábado";
		for (int i = 0; i < 7; i++) {
			System.out.println("Hoje é " + semana[i] + " ");
		}
		
	}

}

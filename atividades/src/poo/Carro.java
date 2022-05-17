package poo;

public class Carro {
	boolean andando;
	String modelo;
	String portas;
public void abastecer() {
	andando = true;
}
public void desabastecer() {
	andando = false;
}
public void sair(){
	if(andando == true){
		System.out.println("Diriga com segurança.");
	} else{
		System.out.println("O carro precisa estar abastecido para andar.");
	}
}
}

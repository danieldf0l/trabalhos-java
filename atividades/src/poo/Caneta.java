package poo;

public class Caneta{
	boolean tampada;
	String cor;
	String marca;
public void tampar(){
	 tampada = true;
}
public void destampar (){
	tampada = false;
}
public void escrever (){
	if (tampada == true){
		System.out.println("Não é possível escrever.");
	} else{
		System.out.println("Agora é possível escrever.");
	}
}
}

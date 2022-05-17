package poo;

public class Bike {
	boolean pedalando;
	String modelo;
	String marca;
public void pedalar() {
	pedalando = true;
}
public void parar() {
	pedalando = false;
}
public void passear() {
	if (pedalando==true) {
		System.out.println("Bom passeio!");
	} else {
		System.out.println("Você precisa pedalar para sair.");
	}
}
}

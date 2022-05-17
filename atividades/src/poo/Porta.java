package poo;

public class Porta {
	boolean estado;
	String cor;
	String comodo;
public void abrir() {
	estado = true;
}
public void fechar() {
	estado = false;
}
public void alterar() {
	if (estado==true){
		System.out.println("A porta foi Aberta.");
	}else {
		System.out.println("A porta foi fechada");		
	}
}
}

package ar.com.codoacodo.interfaces;

public interface Interface {
	final String hola = "HolaMundo"; // podemos tener métodos, y una constante (final) o varias constantes. 
	
	public void metodo1();// sólo la definicion del método sin cuerpo, es decir no tiene llaves.
	
	public default void metodo2() { // como tiene default, puede tener un cuerpo con llaves, y podria parecer una clase abstracta
		System.out.println("Metodo 2");
	}
}

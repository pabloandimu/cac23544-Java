package ar.com.codoacodo.interfaces;

public class FSLogger implements ILogger {

		//implementar el metodo log 
		//polimorfismo por sobreescritura cambia el comportamiento de la interfaz
	public void log() {
		System.out.println("Grabando en c:/bla");
	}
}

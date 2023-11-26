package ar.com.codoacodo.interfaces;

public class EmailLogger implements ILogger {

	//implementar el metodo log 
	//polimorfismo por sobreescritura cambia el comportamiento de la interfaz
	public void log() {
		System.out.println("enviando Email");
	}
	
	
}

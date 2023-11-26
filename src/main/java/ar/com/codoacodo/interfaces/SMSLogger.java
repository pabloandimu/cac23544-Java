package ar.com.codoacodo.interfaces;

public class SMSLogger implements ILogger {
	
	private String number;
	
	//public SMSLogger (String number) {
	//	this.number = number;
	//} o sino le paso el teléfono por constructor, puedo implementar un SET

	public void log() {
		System.out.println("Enviando SMS al : " + this.number);
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}
}

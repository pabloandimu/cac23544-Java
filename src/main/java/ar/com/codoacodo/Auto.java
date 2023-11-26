package ar.com.codoacodo;

public class Auto {
	
	/* atributos */
	String marca;
	String modelo;
	String color;
	Integer anio;// puedo usar int pero Integer es wrapper de ing
	Boolean encendido;//Boolean con B Mayuscula es objeto, no asi con b minuscula
	Float velocidad;
	Float velocidadMaxima;		
	
	/* constructor - Es lo primero que se va a ejecutar cuando nazca un Objeto */ 
	
	public Auto(
			String marca,
			String modelo,
			String color,
			Integer anio,
			Float velocidadMaxima
			) {
		this.marca = marca;//al atributo de la linea 6 (this.marca) ,
		//le asigno el valor de la linea 16. This es un puntero que apunta a los atributos
		// o metodos de la clase/objeto. 
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.velocidadMaxima = velocidadMaxima; 	
		
		this.encendido = Boolean.FALSE;
		this.velocidad = 0f;
	}
	/* metodos */
	void encender() {
		//este metodo cambia el estado de encendido
		if(!this.encendido) { 
		this.encendido = Boolean.TRUE; // - también funciona true solo. 
		//this.encendido es encendido de linea 10 - atributo		
		} else {
			System.out.println("Ya está encendido!");
		}
	}
	
	void apagar() {
		//este metodo cambia el estado de encendido a apagado
		if(this.encendido) { 
		this.encendido = Boolean.FALSE; // - también funciona false solo. 
		this.velocidad = 0f;
		//this.encendido es encendido de linea 10 - atributo		
		} else {
			System.out.println("Ya está apagado! No se puede apagar dos veces.");
		}
	}
	
	void acelerar() {		
		if(this.encendido) { 
			if(velocidad < velocidadMaxima) {
				this.velocidad++; 
			} else {
			System.out.println("No podés acelerar, llegaste a la velocidad máxima.");
			}
			
		} else {
			System.out.println("Primero debes encender el auto para acelerar");
		}
	}
	
	void frenar() {
		if(this.encendido) {
			if(velocidad > 0) {
				this.velocidad--;
			} else {
				System.out.println("El auto llego a velocidad 0");
			}
		} else {
			System.out.println("Auto apagodo, frenado.");
		}
	}
	
	void frenarConGanas() {
		if(this.encendido) {
			while(this.velocidad > 0) {
				this.velocidad--;
				System.out.println("...frenando..." + "(velocidad " + this.velocidad + " )" );
				if(this.velocidad == 0) {
					System.out.println("Frenado");
				}
			}
		}
	}
}







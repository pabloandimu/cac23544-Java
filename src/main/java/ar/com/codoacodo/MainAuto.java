package ar.com.codoacodo;

public class MainAuto {

		public static void main(String[] args) {
			//crear un auto a partir de la clase auto, con NEW, nace un objeto
			Auto clio = new Auto(
					"renault", 
					"clio", 
					"azul", 
					2020, 
					150f);
			//clio es un objeto de la Clase Auto
			
			clio.encender();
			clio.acelerar();
			clio.acelerar();
			clio.frenarConGanas();
		}
}

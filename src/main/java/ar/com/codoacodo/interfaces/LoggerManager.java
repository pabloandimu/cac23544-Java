package ar.com.codoacodo.interfaces;

public class LoggerManager {
	private String target;
	
// esta sería la forma estática del metodo sin instanciar el objeto (en Static no se puede usar el THIS)
	public static ILogger getLogger(String target) {
		// a > FSLogger , b > EmailLogger y c > SMSLogger;
		// Interface I = nex ClaseQueImplementa, como Clase Padre = new ClaseHijoQueImplementa		
		
		ILogger logger;
		
		switch (target) {
		case "A":
			logger = new SMSLogger();
			((SMSLogger)logger).setNumber("+54 341 6554433");
			break;
			
		case "B":
			logger = new FSLogger();
			break;
			
		case "C":
			logger = new EmailLogger();
			break;

		default:
			logger = null;
			break;
		}
		
		return logger;
	} 
	
	public LoggerManager(String target) {
		this.target = target;
	}
	
	public ILogger getLogger() {
		// a > FSLogger , b > EmailLogger y c > SMSLogger;
		// Interface I = nex ClaseQueImplementa, como Clase Padre = new ClaseHijoQueImplementa		
		
		ILogger logger;
		
		switch (this.target) {
		case "A":
			logger = new SMSLogger();
			System.out.println("Ingrese numero");
			((SMSLogger)logger).setNumber("+54 341 6554433");
			break;
			
		case "B":
			logger = new FSLogger();
			break;
			
		case "C":
			logger = new EmailLogger();
			break;

		default:
			logger = null;
			break;
		}
		
		return logger;
}
}	

package ar.com.codoacodo.interfaces;

public class MainLogger {


	public static void main(String[] args) {
	
		//String target = getTargetFromDB();
		// a o b o c
		
		//le pido a LoggerManger
		//LoggerManager lm = new LoggerManager(target); // esto devuelve un ILogger
		//ILogger logger = lm.getLogger(); // esto devuelve el ILogger y sólo puedo ver su metodo log();
		
		// ESTO DE ABAJO CONSTRUYENDO UN VECTOR QUE MAPEE TODAS LAS OPCIONES Y LAS MUESTRA EN UN ARRAY
		
		ILogger[] loggers = new ILogger[5]; // tengo un Vector (o Array) de interfaces.
		loggers[0] = LoggerManager.getLogger("A"); // esto devuelve una interfaz
		loggers[1] = LoggerManager.getLogger("B"); // esto devuelve otra interfaz
		loggers[2] = LoggerManager.getLogger("C"); // y esto devuelve otra interfaz
		loggers[3] = LoggerManager.getLogger("C");  
		loggers[4] = LoggerManager.getLogger("C");
		
		for (ILogger iLogger : loggers) {
			iLogger.log();
		}
		
		 
		//logger.log();
		
	}

	
	//public static String getTargetFromDB() {
	//	return "C";
	//}
}	

package ar.com.codoacodo.repository;

import java.sql.Connection;

import java.sql.DriverManager;
import java.lang.IllegalArgumentException;

public class AdministradorDeConexiones {

	// va a tener un método estatico, que se puede usar sin usar una instancia de la clase
	// o sea voy a poder usar AdministradorDeConexiones.metodo, sin crear una instancia
	
	public static Connection getConnection() {
		String username = "root";
		String password = "trialismo";
		String port = "3306";
		String host = "localhost";
		String dbName = "integrador_cac";
		  
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		String dbUrl = "jdbc:mysql://"+host+":"+port+"/"+dbName + "?allowPublicKeyRetrieval=true&serverTimeZone=UTC&useSSL=false";
		
		//no vemos try/catch! pero lo vamos a usar. 
		
		try {
			Class.forName(driverName);
			return DriverManager.getConnection(dbUrl, username, password);
		} catch(Exception e) {
			throw new IllegalArgumentException("No se pudo conectar a la db: " + dbUrl);
		}
	}
}

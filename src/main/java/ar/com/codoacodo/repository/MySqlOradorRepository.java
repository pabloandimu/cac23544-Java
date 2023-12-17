package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.com.codoacodo.entity.Orador;
import ar.com.codoacodo.utils.DateUtils;

public class MySqlOradorRepository implements OradorRepository {

	@Override
	public void save(Orador orador) {
		//get del orador para obtener datos
		//1 - obtener conexion		
		//Connection con = AdministradorDeConexiones.getConnection();
		
		//2 - preparo el sql que voy a consultar, y los signos de pregunta en value son para evitar sql injection!
		String sql = "insert into orador (nombre, apellido, email, tema, fecha_alta) values (?,?,?,?,?)"; 
		// String sql = "insert into orador (nombre, apelligo, email, tema, fecha_alta) values (?,?,?,?,?)";  SI TENGO UN CURRENT TIMESMAP
		
		try(Connection con = AdministradorDeConexiones.getConnection()) {
		PreparedStatement statement = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		
		statement.setString(1, orador.getNombre());
		statement.setString(2, orador.getApellido());
		statement.setString(3, orador.getMail());
		statement.setString(4, orador.getTema());
		statement.setDate(5, new java.sql.Date(DateUtils.asDate(orador.getFechaAlta()).getTime()));
		
		//Local date instance
		//LocalDate localDate = LocalDate.now(); 
		//Get LocalDate from SQL date
		//java.sql.Date.valueOf( localDate );
		 
		//statement.setDate(5, new java.sql.Date(System.currentTimeMillis())); SI TENGO UN CURRENT TIMESMAP
		
		statement.executeUpdate();//IN SERT/UPDATE/DELETE
		
		ResultSet res = statement.getGeneratedKeys();
		if(res.next()) {
			Long id = res.getLong(1);// aca esta el ID
			orador.setId(id);
		}  
	} catch (Exception e) {
		throw new IllegalArgumentException("No se pudo crear el orador:",e);
	}
		
} 

	@Override
	public Orador getById(Long id) {
			//get del orador para obtener datos
		
			//1 - obtener conexion		
			
			//2 - preparo consulta
			String sql = "select id, nombre, apellido, email, tema, fecha_alta from orador where id = ?"; 
				
			Orador orador = null;
			try(Connection con = AdministradorDeConexiones.getConnection()) {
				PreparedStatement statement = con.prepareStatement(sql);			
				statement.setLong(1, id);
				
				ResultSet res = statement.executeQuery();//IN SERT/UPDATE/DELETE
				
				if(res.next()) {
					Long dbId = res.getLong(1);  
					String nombre = res.getString(2);
					String apellido = res.getString(3);
					String email = res.getString(4);
					String tema = res.getString(5);
					Date fechaAlta = res.getDate(6);
					
					orador = new Orador(dbId, nombre, apellido, email, tema,DateUtils.asLocalDate(fechaAlta));
				}   
			} catch (Exception e) {
				throw new IllegalArgumentException("No se pudo crear el orador:",e);
			} 
			
			
			return orador;
		}

	@Override
	public void update(Orador orador) {
		String sql = "update orador "
				+ "set nombre=?, apellido=?, email=?, tema=? "
				+ "where id = ?";
		
		//try with resources
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			
			PreparedStatement statement = con.prepareStatement(sql);
			
			statement.setString(1, orador.getNombre());
			statement.setString(2, orador.getApellido());
			statement.setString(3, orador.getMail());
			statement.setString(4, orador.getTema());
			statement.setLong(5, orador.getId());
			
			statement.executeUpdate();
		}catch (Exception e) {
			throw new IllegalArgumentException("No se pudo actualizar el orador:", e);
		}
	}

	@Override
	public void delete(Long id) {
		
		String sql = "delete from orador where id = ?";
		
		//try with resources
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			
			PreparedStatement statement = con.prepareStatement(sql);
			
			statement.setLong(1, id);
			
			statement.executeUpdate();
		}catch (Exception e) {
			throw new IllegalArgumentException("No se pudo eliminar el orador:", e);
		}
	}

	@Override
	public List<Orador> findAll() {
		
		
		String sql = "select id, nombre, apellido, email, tema, fecha_alta from orador"; 
			
		List<Orador> oradores = new ArrayList<>();
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			PreparedStatement statement = con.prepareStatement(sql);			
			
			ResultSet res = statement.executeQuery();//IN SERT/UPDATE/DELETE
			
			while (res.next()) {
				Long dbId = res.getLong(1);  
				String nombre = res.getString(2);  
				String apellido = res.getString(3); 				 
				String email = res.getString(4);  
				String tema = res.getString(5); 
				LocalDate fechaAlta = DateUtils.asLocalDate(res.getDate(6));  
				
				oradores.add(new Orador(dbId, nombre, apellido , email, tema, LocalDate.now()));
			}   
		} catch (Exception e) {
			throw new IllegalArgumentException("No se pudo crear el orador:",e);
		} 
		
		return oradores;		// TODO Auto-generated method stub

	}


}

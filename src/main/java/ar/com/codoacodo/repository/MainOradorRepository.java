package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {


	public static void main(String[] args) {

		//Interface i = new ClaseQueImplementa();
		
		//Orador newOrador = new Orador("pablo", "Mujica", "email@gmail.com", "JS", LocalDate.now());
		// repository.save(newOrador);
		
		//obtener un orador de la DB
		//Orador newOrador = repository.getById(1L);
		
		//fIND ALL
		
		//System.out.println(orador);
		OradorRepository repository = new MySqlOradorRepository();
		
		//repository.save(new Orador("elena", "schmidt", "elena@gmail.com", "TypeScript", LocalDate.now()));
		
		//repository.delete(12L);
		
		Orador pablo =repository.getById(11L);
		
		pablo.setApellido("Firpo");
		pablo.setNombre("Andres");
		pablo.setTema("JS");
		
		repository.update(pablo);
		
		//pablo.setMail("pablo_am8m@yahoo.com.ar");
		
		System.out.println(repository.findAll());
		
		
	}
}

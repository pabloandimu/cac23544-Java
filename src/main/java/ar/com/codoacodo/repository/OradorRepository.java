package ar.com.codoacodo.repository;
// lo que sigue pertenece a Java collection framework (se ve en spring)
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public interface OradorRepository {
	
	public void save(Orador orador);
	
	public Orador getById(Long id);
	
	public void update(Orador orador);	
	
	public void delete(Long id);
	
	public List<Orador> findAll(); // esto es una forma "linda" de no usar vertores y se ve en Spring

}

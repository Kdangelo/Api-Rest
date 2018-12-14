package cl.kvz.kdangelo.dao;

import java.util.List;

import cl.kvz.kdangelo.model.Contacto;
 
public interface ContactoDao {
	
	void saveContacto(Contacto contacto);
	
	void updateContacto(Contacto contacto);
	
	void deleteContactoById(Integer id);
	
	List<Contacto> findAllContacto();
	
	Contacto findById(Integer id);
	
	Contacto findByName(String nombre);
	
}
package cl.kvz.kdangelo.service;

import java.util.List;

import cl.kvz.kdangelo.model.Contacto;

public interface ContactoService {
	
	void saveContacto(Contacto contacto);
	
	void updateContacto(Contacto contacto);
	
	void deleteContactoById(Integer id);
	
	List<Contacto> findAllContacto();
	
	Contacto findById(Integer id);
	
	Contacto findByName(String nombre);

}
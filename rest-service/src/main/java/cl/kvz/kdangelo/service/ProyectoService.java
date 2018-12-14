package cl.kvz.kdangelo.service;

import java.util.List;

import cl.kvz.kdangelo.model.Proyecto;

public interface ProyectoService {

	void saveProyecto(Proyecto proyecto);
	
	void updateProyecto(Proyecto proyecto);
	
	void deleteProyectoById(Integer id);
	
	List<Proyecto> findAllProyecto();
	
	Proyecto findById(Integer id);
	
	Proyecto findByName(String nombre);
	
	List<Proyecto> findByIdProveedor(Integer id);
	
}
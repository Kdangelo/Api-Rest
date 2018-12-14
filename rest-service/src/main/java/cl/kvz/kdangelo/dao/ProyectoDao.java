package cl.kvz.kdangelo.dao;

import java.util.List;

import cl.kvz.kdangelo.model.Proyecto;

public interface ProyectoDao {

	void saveProyecto(Proyecto proyecto);
	
	void updateProyecto(Proyecto proyecto);
	
	void deleteProyectoById(Integer id);
	
	List<Proyecto> findAllProyecto();
	
	Proyecto findById(Integer id);
	
	Proyecto findByName(String nombre);
	
	List<Proyecto> findByIdProveedor(Integer id);
	
}
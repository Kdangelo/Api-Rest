package cl.kvz.kdangelo.service;

import java.util.List;

import cl.kvz.kdangelo.model.Proveedor;

public interface ProveedorService {
	
	void saveProveedor(Proveedor proveedor);
	
	void updateProveedor(Proveedor proveedor);
	
	void deleteProveedorById(Integer id);
	
	List<Proveedor> findAllProveedor();
	
	Proveedor findById(Integer id);
	
	Proveedor findByNombre(String nombre);

}
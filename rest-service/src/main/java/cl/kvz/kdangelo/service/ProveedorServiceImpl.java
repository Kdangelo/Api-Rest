package cl.kvz.kdangelo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.kvz.kdangelo.dao.ProveedorDao;
import cl.kvz.kdangelo.model.Proveedor;

@Service("proveedorService")
@Transactional
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorDao _proveedorDao;
	
	@Override
	public void saveProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		_proveedorDao.saveProveedor(proveedor);
	}

	@Override
	public void updateProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		_proveedorDao.updateProveedor(proveedor);
	}

	@Override
	public void deleteProveedorById(Integer id) {
		// TODO Auto-generated method stub
		_proveedorDao.deleteProveedorById(id);
	}

	@Override
	public List<Proveedor> findAllProveedor() {
		// TODO Auto-generated method stub
		return _proveedorDao.findAllProveedor();
	}

	@Override
	public Proveedor findById(Integer id) {
		// TODO Auto-generated method stub
		return _proveedorDao.findById(id);
	}

	@Override
	public Proveedor findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return _proveedorDao.findByNombre(nombre);
	}

}
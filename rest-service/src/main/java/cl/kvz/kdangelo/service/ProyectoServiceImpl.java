package cl.kvz.kdangelo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.kvz.kdangelo.dao.ProyectoDao;
import cl.kvz.kdangelo.model.Proyecto;

@Service("proyectoService")
@Transactional
public class ProyectoServiceImpl implements ProyectoService {

	@Autowired
	private ProyectoDao _proyectoDao;
	
	@Override
	public void saveProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		_proyectoDao.saveProyecto(proyecto);
	}

	@Override
	public void updateProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		_proyectoDao.updateProyecto(proyecto);
	}

	@Override
	public void deleteProyectoById(Integer id) {
		// TODO Auto-generated method stub
		_proyectoDao.deleteProyectoById(id);
	}

	@Override
	public List<Proyecto> findAllProyecto() {
		// TODO Auto-generated method stub
		return _proyectoDao.findAllProyecto();
	}

	@Override
	public Proyecto findById(Integer id) {
		// TODO Auto-generated method stub
		return _proyectoDao.findById(id);
	}

	@Override
	public Proyecto findByName(String nombre) {
		// TODO Auto-generated method stub
		return _proyectoDao.findByName(nombre);
	}

	@Override
	public List<Proyecto> findByIdProveedor(Integer id) {
		// TODO Auto-generated method stub
		return _proyectoDao.findByIdProveedor(id);
	}

}
package cl.kvz.kdangelo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.kvz.kdangelo.dao.ContactoDao;
import cl.kvz.kdangelo.model.Contacto;

@Service("contactoService")
@Transactional
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoDao _contactoDao;
	
	@Override
	public void saveContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		_contactoDao.saveContacto(contacto);
	}

	@Override
	public void updateContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		_contactoDao.updateContacto(contacto);
	}

	@Override
	public void deleteContactoById(Integer id) {
		// TODO Auto-generated method stub
		_contactoDao.deleteContactoById(id);
	}

	@Override
	public List<Contacto> findAllContacto() {
		// TODO Auto-generated method stub
		return _contactoDao.findAllContacto();
	}

	@Override
	public Contacto findById(Integer id) {
		// TODO Auto-generated method stub
		return _contactoDao.findById(id);
	}

	@Override
	public Contacto findByName(String nombre) {
		// TODO Auto-generated method stub
		return _contactoDao.findByName(nombre);
	}

}
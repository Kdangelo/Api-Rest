package cl.kvz.kdangelo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cl.kvz.kdangelo.model.Contacto;

@Repository
@Transactional
public class ContactoDaoImpl extends AbstractSession implements ContactoDao {

	@Override
	public void saveContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		getSession().persist(contacto);
	}

	@Override
	public void updateContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		getSession().update(contacto);
	}

	@Override
	public void deleteContactoById(Integer id) {
		// TODO Auto-generated method stub
		Contacto contacto = findById(id);
		if ( contacto != null ) {
			getSession().delete(contacto);
		}
	}

	@Override
	public List<Contacto> findAllContacto() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Contacto").list();
	}

	@Override
	public Contacto findById(Integer id) {
		// TODO Auto-generated method stub
		return (Contacto) getSession().get(Contacto.class, id);
	}

	@Override
	public Contacto findByName(String nombre) {
		// TODO Auto-generated method stub
		return (Contacto) getSession().createQuery(
				"from Contacto where nombre = :nombre")
				.setParameter("nombre", nombre);
	}

}
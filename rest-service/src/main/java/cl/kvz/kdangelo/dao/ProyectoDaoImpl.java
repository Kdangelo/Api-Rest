package cl.kvz.kdangelo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cl.kvz.kdangelo.model.Proyecto;

@Repository
@Transactional
public class ProyectoDaoImpl extends AbstractSession implements ProyectoDao {

	@Override
	public void saveProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		getSession().persist(proyecto);
	}

	@Override
	public void updateProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		getSession().update(proyecto);
	}

	@Override
	public void deleteProyectoById(Integer id) {
		// TODO Auto-generated method stub
		Proyecto proyecto = findById(id);
		if ( proyecto != null ) {
			getSession().delete(proyecto);
		}
	}

	@Override
	public List<Proyecto> findAllProyecto() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Proyecto").list();
	}

	@Override
	public Proyecto findById(Integer id) {
		// TODO Auto-generated method stub
		return (Proyecto) getSession().get(Proyecto.class, id);
	}

	@Override
	public Proyecto findByName(String nombre) {
		// TODO Auto-generated method stub
		return (Proyecto) getSession().createQuery(
				"from Proyecto where nombre = :nombre")
				.setParameter("nombre", nombre);
	}

	@Override
	public List<Proyecto> findByIdProveedor(Integer id) {
		// TODO Auto-generated method stub
		return (List<Proyecto>) getSession().createQuery(
				"from Proyecto p join p.proveedor t where t.id = :id")
				.setParameter("id", id).list();
	}

}
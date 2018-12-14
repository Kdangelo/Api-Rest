package cl.kvz.kdangelo.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cl.kvz.kdangelo.model.Proveedor;
import cl.kvz.kdangelo.model.ProveedorContacto;

@Repository
@Transactional
public class ProveedorDaoImpl extends AbstractSession implements ProveedorDao {

	@Override
	public void saveProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		getSession().persist(proveedor);
	}

	@Override
	public void updateProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		getSession().update(proveedor);
	}

	@Override
	public void deleteProveedorById(Integer id) {
		// TODO Auto-generated method stub
		Proveedor proveedor = findById(id);
		if ( proveedor != null ) {
			Iterator<ProveedorContacto> i = proveedor.getProveedorContacto().iterator();
			while (i.hasNext()) {
				ProveedorContacto proveedorContacto = (ProveedorContacto) i.next();
				i.remove();
				getSession().delete(proveedorContacto);
			}
			proveedor.getProveedorContacto().clear();
			getSession().delete(proveedor);
		}
	}

	@Override
	public List<Proveedor> findAllProveedor() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Proveedor").list();
	}

	@Override
	public Proveedor findById(Integer id) {
		// TODO Auto-generated method stub
		return (Proveedor) getSession().get(Proveedor.class, id);
	}

	@Override
	public Proveedor findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return (Proveedor) getSession().createQuery(
				"from Proveedor where nombre = :nombre")
				.setParameter("nombre", nombre);
	}
	
}
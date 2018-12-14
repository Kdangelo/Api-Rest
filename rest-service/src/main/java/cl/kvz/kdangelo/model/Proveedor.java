package cl.kvz.kdangelo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "SEC_PROVEEDOR", sequenceName = "SEC_PROVEEDOR")
@Table (name = "PROVEEDOR")
public class Proveedor implements Serializable {

	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = 1306097591392935934L;
	
	@Id 
	@GeneratedValue(generator="SEC_PROVEEDOR") 
	@Column(name = "ID_PROVEEDOR", nullable = false) 
	private Integer id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	@OneToMany(mappedBy = "proveedor", fetch = FetchType.EAGER)
	private List<Proyecto>  proyecto;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "id", columnDefinition = "number(10,0)")
	private List<ProveedorContacto> proveedorContacto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Proyecto> getProyecto() {
		return proyecto;
	}

	public void setProyecto(List<Proyecto> proyecto) {
		this.proyecto = proyecto;
	}

	public List<ProveedorContacto> getProveedorContacto() {
		return proveedorContacto;
	}

	public void setProveedorContacto(List<ProveedorContacto> proveedorContacto) {
		this.proveedorContacto = proveedorContacto;
	}

}
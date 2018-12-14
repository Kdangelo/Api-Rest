package cl.kvz.kdangelo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "SEC_CONTACTO", sequenceName = "SEC_CONTACTO")
@Table(name = "CONTACTO")
public class Contacto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7718673329590483356L;

	@Id
	@GeneratedValue(generator = "SEC_CONTACTO")
	@Column(name = "ID_CONTACTO", nullable = false)
	private Integer id;

	@Column(name = "NOMBRE")
	private String name;
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	@Column(name = "CARGO")
	private String cargo;

	@OneToMany
	@JoinColumn(name = "ID_PROVEEDOR_CONTACTO", columnDefinition = "number(10,0)")
	private List<ProveedorContacto> proveedorContacto;

	
}
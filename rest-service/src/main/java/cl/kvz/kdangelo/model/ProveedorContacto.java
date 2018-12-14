package cl.kvz.kdangelo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "SEC_PROVEEDOR_CONTACTO", sequenceName = "SEC_PROVEEDOR_CONTACTO")
@Table (name = "PROVEEDOR_CONTACTO")
public class ProveedorContacto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6853147967821211114L;

	@Id 
	@GeneratedValue(generator="SEC_PROVEEDOR_CONTACTO") 
	@Column(name = "ID_PROVEEDOR_CONTACTO", nullable = false) 
	private Integer id;
	
	@Column(name = "ALIAS")
	private String alias;
	
	@ManyToOne //falta fetch o mapeo???
	@JoinColumn(name = "id")
	private Proveedor proveedor;
	
	@ManyToOne //falta fetch o mapeo???
	@JoinColumn(name = "id", columnDefinition = "number(10,0)")
	private Contacto contacto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

}
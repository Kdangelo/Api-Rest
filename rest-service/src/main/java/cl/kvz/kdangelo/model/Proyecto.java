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
@SequenceGenerator(name = "SEC_PROYECTO", sequenceName = "SEC_PROYECTO")
@Table (name = "PROYECTO")
public class Proyecto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9177979287331866860L;

	@Id 
	@GeneratedValue(generator="SEC_PROYECTO") 
	@Column(name = "ID_PROYECTO", nullable = false)
	private Integer id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "id", columnDefinition = "number(10,0)")
	private Proveedor proveedor;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
}
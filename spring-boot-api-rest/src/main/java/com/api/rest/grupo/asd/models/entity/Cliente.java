package com.api.rest.grupo.asd.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author json
 * Modelo o entidad que se utilizó para la creación del API REST.
 * En el enfoque Modelo Primero, usted crea las jerarquías de entidades, 
 * relaciones y herencia directamente en la superficie de diseño
 * y luego genera la base de datos a partir de su modelo.
 */
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; //consecutivo
	private String desNom; //Nombre del producto
	private String descrip; //Descripción del  producto
	private String tipo; //Tipo de producto
	private String serial; //Serial del producto
	private Long numInt; //Número de Registro Interno del producto
	private Long peso; //Peso del producto
	private Long ancho; //Ancho del producto
	private Long largo; // Largo del Producto
	private Long valCom; //Valor del producto

	@Column(name="fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fecBaj; //Fecha de baja del producto
	
	@Column(name="fec_com")
	@Temporal(TemporalType.DATE)
	private Date fecCom; //Fecha de compra del producto
	
	@PrePersist
	public void prePersist() {
		fecCom= new Date();
	}
	private String estAct; //Estado del producto
	private String color; //Color del producto
	private String asigna; //Asignación del producto

	
	/**
	 * Getter an Setter
	 * Los Setters & Getters son métodos de acceso lo que indica que son siempre declarados públicos, 
	 * y nos sirven para dos cosas: Setters: Del Inglés Set, que significa establecer, 
	 * pues nos sirve para asignar un valor inicial a un atributo, pero de forma explícita, 
	 * además el Setter nunca retorna nada (Siempre es void), 
	 * y solo nos permite dar acceso público a ciertos atributos que deseemos el usuario pueda modificar.
	 * Getters: Del Inglés Get, que significa obtener, pues nos sirve para obtener (recuperar o acceder)
	 *  el valor ya asignado a un atributo y utilizarlo para cierto método.
	 */
	public Date getFecCom() {
		return fecCom;
	}

	public void setFecCom(Date fecCom) {
		this.fecCom = fecCom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesNom() {
		return desNom;
	}

	public void setDesNom(String desNom) {
		this.desNom = desNom;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Long getNumInt() {
		return numInt;
	}

	public void setNumInt(Long numInt) {
		this.numInt = numInt;
	}

	public Long getPeso() {
		return peso;
	}

	public void setPeso(Long peso) {
		this.peso = peso;
	}

	public Long getAncho() {
		return ancho;
	}

	public void setAncho(Long ancho) {
		this.ancho = ancho;
	}

	public Long getLargo() {
		return largo;
	}

	public void setLargo(Long largo) {
		this.largo = largo;
	}

	public Long getValCom() {
		return valCom;
	}

	public void setValCom(Long valCom) {
		this.valCom = valCom;
	}

	public Date getFecBaj() {
		return fecBaj;
	}

	public void setFecBaj(Date fecBaj) {
		this.fecBaj = fecBaj;
	}

	public String getEstAct() {
		return estAct;
	}

	public void setEstAct(String estAct) {
		this.estAct = estAct;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAsigna() {
		return asigna;
	}

	public void setAsigna(String asigna) {
		this.asigna = asigna;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

package com.proyectoe2.gamm.model;


public class Comida {

	private Integer id;
	private String nombre;
	private String descripcion;
	private String descuento;
	private Integer categoria;
	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	private Double precio;
	
	public Integer getCategoria() {
		return categoria;
	}
	
	private Integer oferta;
	private String imagen="no-image.png";
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getOferta() {
		return oferta;
	}
	public void setOferta(Integer oferta) {
		this.oferta = oferta;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Comida [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", descuento=" + descuento
				+ ", categoria=" + categoria + ", precio=" + precio + "]";
	}
	
	
	
}
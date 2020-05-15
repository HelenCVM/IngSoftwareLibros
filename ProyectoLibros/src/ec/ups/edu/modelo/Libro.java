package ec.ups.edu.modelo;

import java.util.List;

public  abstract class  Libro {
	public String titulo;
	public String autor;
	public String edicion;
	public double precio;
	public double comision;
	
	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getEdicion() {
		return edicion;
	}



	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getComision() {
		return comision;
	}



	public void setComision(double comision) {
		this.comision = comision;
	}



	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + ", precio=" + precio
				+ ", comision=" + comision + "]";
	}



	public double calcularPrecioFinal() {
		return calcularComision() + precio()+costoEnvio()+calcularComisionIva();
		
	}
	public abstract  double calcularComision();
	public abstract double precio();
	public abstract double calcularComisionIva();
	public abstract double costoEnvio();
	
	
	
	
}

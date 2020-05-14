package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.List;

public class LibroDigital  extends Libro{
	
		public LibroDigital() {
		
	}

	
	public int costofijo;
	public int costocomision;
	
	
	
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return super.getTitulo();
	}
	@Override
	public void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		super.setTitulo(titulo);
	}
	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return super.getAutor();
	}
	@Override
	public void setAutos(String autor) {
		// TODO Auto-generated method stub
		super.setAutos(autor);
	}
	@Override
	public String getEdicion() {
		// TODO Auto-generated method stub
		return super.getEdicion();
	}
	@Override
	public void setEdicion(String edicion) {
		// TODO Auto-generated method stub
		super.setEdicion(edicion);
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return super.getPrecio();
	}
	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		super.setPrecio(precio);
	}
	public LibroDigital(int costofijo, int costocomision) {
		super();
		this.costofijo = costofijo;
		this.costocomision = costocomision;
	}
	public int getCostofijo() {
		return costofijo;
	}
	public void setCostofijo(int costofijo) {
		this.costofijo = costofijo;
	}
	public int getCostocomision() {
		return costocomision;
	}
	public void setCostocomision(int costocomision) {
		this.costocomision = costocomision;
	}
	@Override
	public String toString() {
		return "LibroDigital [costofijo=" + costofijo + ", costocomision=" + costocomision + "]";
	}
	
	
	public List<LibroDigital> listarLibro() {
		List<LibroDigital> libDigital = new ArrayList<>();
		for (LibroDigital libros:libDigital) {
			System.out.println(libros);
		}
		return libDigital;
	}
	
	
}

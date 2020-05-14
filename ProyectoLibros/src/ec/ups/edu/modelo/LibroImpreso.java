package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.List;


public class LibroImpreso  extends Libro {
	public int comision;
	public int gastoenvio;

	
	public LibroImpreso() {
		
	}
	
	public LibroImpreso(int comision, int gastoenvio) {
		super();
		this.comision = comision;
		this.gastoenvio = gastoenvio;
	}



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

	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public int getGastoenvio() {
		return gastoenvio;
	}
	public void setGastoenvio(int gastoenvio) {
		this.gastoenvio = gastoenvio;
	}

	public List<LibroImpreso> listarLibroImpreso() {
		// TODO Auto-generated method stub
		List<LibroImpreso> libImpresos = new ArrayList<>();
		for (LibroImpreso libros:libImpresos) {
			System.out.println(libros);
		}
		return libImpresos;
	}
	
	@Override
	public String toString() {
		return "LibroImpreso [comision=" + comision + ", gastoenvio=" + gastoenvio + "]";
	}
	
	
	
	
	
}

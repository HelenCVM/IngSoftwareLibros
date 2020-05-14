package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compras {
	private int codigo;
	private Date fecha;
	private List<LibroDigital>libDigital;
	private List<LibroImpreso>libImpreso;
	
	public Compras() {
		
	}
	public Compras(int codigo, Date fecha, List<LibroDigital> libDigital, List<LibroImpreso> libImpreso) {
		
		this.codigo = codigo;
		this.fecha = fecha;
		this.libDigital = new ArrayList<LibroDigital>();
		this.libImpreso = new ArrayList<LibroImpreso>();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<LibroDigital> getLibDigital() {
		return libDigital;
	}
	public void setLibDigital(List<LibroDigital> libDigital) {
		this.libDigital = libDigital;
	}
	public List<LibroImpreso> getLibImpreso() {
		return libImpreso;
	}
	public void setLibImpreso(List<LibroImpreso> libImp) {
		this.libImpreso = libImp;
	}
	public void agregarlibImpreso(LibroImpreso libImpreso) {
		this.getLibImpreso().add(libImpreso);
	}
	public void agregarlibDigital(LibroDigital libDigital) {
		this.agregarlibDigital(libDigital);
	}
	public List<LibroImpreso> listarLibroImpreso() {
		// TODO Auto-generated method stub
		List<LibroImpreso> libImpresos = new ArrayList<>();
		for (LibroImpreso libros:libImpresos) {
			System.out.println(libros);
		}
		return libImpresos;
	}
	
}

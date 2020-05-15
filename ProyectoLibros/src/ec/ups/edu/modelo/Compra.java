package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	private int codigo;
	private String fecha;
	private List<LibroDigital>listlibDigital;
	private List<LibroImpreso>listlibImpreso;
	private Cliente cliente;
	
	public Compra(int codigo, String fecha, Cliente cliente) {
		
		this.codigo = codigo;
		this.fecha = fecha;
		this.cliente = cliente;
		this.listlibDigital= new ArrayList<LibroDigital>();
		this.listlibImpreso=new ArrayList<LibroImpreso>();
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public List<LibroDigital> getListlibDigital() {
		return listlibDigital;
	}


	public void setListlibDigital(List<LibroDigital> listlibDigital) {
		this.listlibDigital = listlibDigital;
	}


	public List<LibroImpreso> getListlibImpreso() {
		return listlibImpreso;
	}


	public void setListlibImpreso(List<LibroImpreso> listlibImpreso) {
		this.listlibImpreso = listlibImpreso;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public LibroImpreso agregarlibImpreso(LibroImpreso libImpreso) {
			libImpreso.toString();
			this.getListlibImpreso().add(libImpreso);
			return libImpreso;
			
		
	}
	public LibroDigital agregarlibDigital(LibroDigital libDigital) {
		libDigital.toString();
		this.getListlibDigital().add(libDigital);
		return libDigital;
		
	
}
		
	
	@Override
	public String toString() {
		return "Compras [codigo=" + codigo + ", fecha=" + fecha + ", listlibDigital=" + listlibDigital
				+ ", listlibImpreso=" + listlibImpreso + ", cliente=" + cliente + "]";
	}
	public List<Cliente> listarComprar (){
		  
		return null;
		
	}
	
}

package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compras {
	private int codigo;
	private String fecha;
	private List<LibroDigital>listlibDigital;
	private List<LibroImpreso>listlibImpreso;
	private Cliente cliente;
	public Compras() {
		
	}
	
	public Compras(int codigo, String fecha, List<LibroDigital> listlibDigital, List<LibroImpreso> listlibImpreso,
			Cliente cliente) {
		
		this.codigo = codigo;
		this.fecha = fecha;
		this.listlibDigital = listlibDigital;
		this.listlibImpreso = listlibImpreso;
		this.cliente = cliente;
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

	public void agregarlibImpreso(LibroImpreso libImpreso) {
		this.getListlibImpreso().add(libImpreso);
	}
	public void agregarlibDigital(LibroDigital libDigital) {
		this.getListlibDigital().add(libDigital);
	}
	
	public double devitarSaldo() {
		double total=this.getCliente().getCreditos().getTotalCreditos();
		for (int i = 0; i < this.getListlibDigital().size(); i++) {
			
			
		}
		
		return total;
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

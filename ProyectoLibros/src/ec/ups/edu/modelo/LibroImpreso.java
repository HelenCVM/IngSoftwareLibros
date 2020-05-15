package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.List;


public class LibroImpreso  extends Libro {
	
	public int gastoenvio;

	public int getGastoenvio() {
		return gastoenvio;
	}
	public void setGastoenvio(int gastoenvio) {
		this.gastoenvio = gastoenvio;
	}
	@Override
	public double calcularComision() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double Precio() {
		double precio=this.getPrecio();
		
		return precio;
	}
	@Override
	public double calcularcomisionIva() {
		double iva=this.getComision();
		double pre=this.getPrecio();
		double total=(iva+pre)/100;
		
		return total;
	}
	@Override
	public double CostoEnvio() {
		double costoenvio= this.getGastoenvio();
		
		return costoenvio;
	}
	
	
	
	

	
	
	
}

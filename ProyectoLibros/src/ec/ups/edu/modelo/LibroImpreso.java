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
	public String toString() {
		return "LibroImpreso [gastoenvio=" + gastoenvio + "]";
	}

	@Override
	public double calcularComision() {
		// TODO Auto-generated method stub
		
		return 0;
	}
		
	@Override
	public int CostoEnvio() {
		int costoEnvio=this.getGastoenvio();
		System.out.println("Costo Envio"+costoEnvio);
		return costoEnvio;
	}
	@Override
	public double Precio() {
		double precio= this.getPrecio();
		System.out.println("Precio"+precio);
		return precio;
	}
	@Override
	public double calcularcomisionIva() {
		double iva= this.getComision();		
		double calcularComisionIva=(iva*Precio())/100;
		System.out.println("Calcular Comision Iva"+calcularComisionIva);
		return calcularComisionIva;
	}
	
	

	
	
	
}

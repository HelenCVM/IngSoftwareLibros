package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.List;

public class LibroDigital  extends Libro{
	
	@Override
	public double calcularComision() {
		double comision= this.getComision();
		System.out.println("Comision"+comision);
		return comision;
	}
	@Override
	public double Precio() {
		double precio=this.getPrecio();
		System.out.println("Precio"+precio);
		return precio;
	}
	@Override
	public double calcularcomisionIva() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int CostoEnvio() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}

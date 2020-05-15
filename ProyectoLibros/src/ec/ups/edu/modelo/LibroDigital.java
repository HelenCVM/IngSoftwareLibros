package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.List;

public class LibroDigital  extends Libro{
	
	@Override
	public double calcularComision() {
		double comision= this.getComision();
				return comision;
	}
	@Override
	public double Precio() {
		double precio=this.getPrecio();
		
		return precio;
	}
	@Override
	public double calcularcomisionIva() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double CostoEnvio() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}

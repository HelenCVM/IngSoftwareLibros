package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Controlador {

	public List<LibroImpreso> agregarLibroImpreso(LibroImpreso libImpreso) {
		// TODO Auto-generated method stub
		List<LibroImpreso> libImpresos = new ArrayList<>();
		libImpresos.add(libImpreso);
		for (LibroImpreso libroImpreso : libImpresos) {
			System.out.println("Autor:"+libroImpreso.getAutor()+" Titulo:"+libroImpreso.getTitulo()+" Precio:"+libImpreso.getPrecio()+
					" Comision Fija:"+libroImpreso.getComision()+" Gasto envio:"+libroImpreso.getGastoenvio()+" Edicion:"+libImpreso.getEdicion()+"\n");
			
		}
		return libImpresos;
		}
	public List<LibroDigital> agregarLibroDigital(LibroDigital libDigital) {
		// TODO Auto-generated method stub
		List<LibroDigital> libDigitales = new ArrayList<>();
		libDigitales.add(libDigital);
		for (LibroDigital libroDigital : libDigitales) {
			System.out.println("Autor:"+libroDigital.getAutor()+" Titulo:"+libroDigital.getTitulo()+" Precio:"+libroDigital.getPrecio()+
					" Comision:"+libroDigital.getComision()+" Gasto envio:"+" Edicion:"+libroDigital.getEdicion()+"\n");
			
		}
		return libDigitales;
		}
	
	
}

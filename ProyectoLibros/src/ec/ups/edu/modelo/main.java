package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * creo los libros impresos
		 */
		System.out.println("Creo los LIBROS IMPRESOS");
			LibroImpreso libImpreso= new LibroImpreso();
			LibroImpreso libImpreso1= new LibroImpreso();
			LibroImpreso li=new LibroImpreso();
			LibroImpreso li1=new LibroImpreso();
			LibroImpreso li2=new LibroImpreso();
			Controlador b= new Controlador();
			libImpreso.setAutor("William Golding");
			libImpreso.setTitulo("El señor de las moscas");
			libImpreso.setEdicion("2012");
			libImpreso.setPrecio(10.20);
			libImpreso.setComision(2);
			libImpreso.setGastoenvio(20);	
			
			
			
			
			libImpreso1.setAutor("Julio Verne");
			libImpreso1.setTitulo("Viaje al centro de la tierra");
			libImpreso1.setEdicion("1864");
			libImpreso1.setPrecio(20.20);
			libImpreso1.setComision(2);
			libImpreso1.setGastoenvio(20);
			libImpreso1.Precio();
			
			
			li.setTitulo("La madre de Frankenstein");
			li.setAutor("Almudena Grandes");
			li.setEdicion("Edicion1");
			li.setPrecio(10.20);
			li.setComision(10);
			li.setGastoenvio(20);
			
			
			li1.setTitulo("Titanic");
			li1.setAutor("Jose Marti");
			li1.setEdicion("Edicion2");
			li1.setPrecio(10.20);
			li1.setComision(10);
			li1.setGastoenvio(20);

			b.agregarLibroImpreso(libImpreso);
			b.agregarLibroImpreso(libImpreso1);
			b.agregarLibroImpreso(li);
			b.agregarLibroImpreso(li1);
			
	    /**
	     * Creo los libros digitales
	     * 
	     */
			System.out.println("Creo los LIBROS DIGITALES");
			LibroDigital libDigital =  new LibroDigital();
			LibroDigital libDigital1 =  new LibroDigital();
			LibroDigital libDigital2=  new LibroDigital();
			LibroDigital libDigital3 =  new LibroDigital();
			
			libDigital.setAutor("Javier Castillo");
			libDigital.setTitulo("El dia que se perdion el amor");
			libDigital.setComision(10);
			libDigital.setPrecio(10.32);
			libDigital.setEdicion("1998");
			//libDigital.calcularPrecioFinal();
			//Libro Digital 2
			libDigital1.setAutor("Ines Plana");
			libDigital1.setTitulo("Morir no es lo que mas duele");
			libDigital1.setComision(10);
			libDigital1.setPrecio(16.55);
			libDigital1.setEdicion("2002");
			//libDigital1.calcularPrecioFinal();
			//Libro Digital 3
			libDigital2.setAutor("Karen Cleveland");
			libDigital2.setTitulo("Toda la verdad");
			libDigital2.setComision(10);
			libDigital2.setPrecio(11.11);
			libDigital2.setEdicion("2010");
			
			b.agregarLibroDigital(libDigital);
			b.agregarLibroDigital(libDigital1);
			b.agregarLibroDigital(libDigital2);
			/**
			 * Compras de un cliente
			 */
			Cliente cliente = new Cliente();
			cliente.setCedula("1724934110");
			cliente.setNombre("Cinthia Malena");
			cliente.setApellido("Iza Cajia");
			System.out.println("Cedula:"+cliente.getCedula()+" Nombre:"+cliente.getNombre()+"  Apellido:"+cliente.getApellido());
			/**
			 * Compras de un Cliente
			 */
			
			/*Compras compra= new Compras();
			 compra.setCliente(cliente);
			 compra.agregarlibDigital(libDigital);
			 compra.agregarlibImpreso(libImpreso1);
			 System.out.println("El cliente: "+compra.getCliente().getNombre()
					 +"  tiene una compra de libro digital"+compra.getListlibDigital()					 
					 +"  tiene una compra de libro impreso"+compra.getListlibImpreso());
			*/
			/**
			 * Agregando Creditos al Cliente
			 */
			Creditos s= new Creditos(1, "12/12/2019",10,15);
			cliente.setCreditos(s);
			System.out.println("El cliente tiene  este interes: " +cliente.getCreditos().getInteres());
			System.out.println("El cliente tiene plazo:"+ cliente.getCreditos().getPlazo());			
			System.out.println("El cliente tiene un total de creditos:"+ cliente.getCreditos().getTotalCreditos());
			cliente.recargarCreditos(30);
			
	}

}

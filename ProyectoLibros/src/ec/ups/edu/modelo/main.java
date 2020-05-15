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
					
			libImpreso.setAutor("William Golding");
			libImpreso.setTitulo("El señor de las moscas");
			libImpreso.setEdicion("2012");
			libImpreso.setPrecio(10.20);
			libImpreso.setComision(2);
			libImpreso.setGastoenvio(20);	
			System.out.println(libImpreso.toString()+", gasto envio:"+libImpreso.getGastoenvio());
			
			
			
			libImpreso1.setAutor("Julio Verne");
			libImpreso1.setTitulo("Viaje al centro de la tierra");
			libImpreso1.setEdicion("1864");
			libImpreso1.setPrecio(20.20);
			libImpreso1.setComision(2);
			libImpreso1.setGastoenvio(20);
			System.out.println(libImpreso1.toString()+", gasto envio:"+libImpreso1.getGastoenvio());
			
			li.setTitulo("La madre de Frankenstein");
			li.setAutor("Almudena Grandes");
			li.setEdicion("Edicion1");
			li.setPrecio(10.20);
			li.setComision(10);
			li.setGastoenvio(20);
			System.out.println(li.toString()+", gasto envio:"+li.getGastoenvio());
			
			
			li1.setTitulo("Titanic");
			li1.setAutor("Jose Marti");
			li1.setEdicion("Edicion2");
			li1.setPrecio(10.20);
			li1.setComision(10);
			li1.setGastoenvio(20);
			System.out.println(li1.toString()+", gasto envio:"+li1.getGastoenvio());
	    /**
	     * Creo los libros digitales
	     * 
	     */
			System.out.println("Creo los LIBROS DIGITALES--------------------------------------------------------------------------------");
			LibroDigital libDigital =  new LibroDigital();
			LibroDigital libDigital1 =  new LibroDigital();
			LibroDigital libDigital2=  new LibroDigital();
			LibroDigital libDigital3 =  new LibroDigital();
			
			libDigital.setAutor("Javier Castillo");
			libDigital.setTitulo("El dia que se perdion el amor");
			libDigital.setComision(10);
			libDigital.setPrecio(10.32);
			libDigital.setEdicion("1998");
			System.out.println(libDigital.toString());
			//libDigital.calcularPrecioFinal();
			//Libro Digital 2
			libDigital1.setAutor("Ines Plana");
			libDigital1.setTitulo("Morir no es lo que mas duele");
			libDigital1.setComision(10);
			libDigital1.setPrecio(16.55);
			libDigital1.setEdicion("2002");
			System.out.println(libDigital1.toString());
			//Libro Digital 3
			libDigital2.setAutor("Karen Cleveland");
			libDigital2.setTitulo("Toda la verdad");
			libDigital2.setComision(10);
			libDigital2.setPrecio(11.11);
			libDigital2.setEdicion("2010");
			System.out.println(libDigital2.toString());
			/**
			 * Compras de un cliente
			 */
			System.out.println("*************************Creacion del Cliente**********************************************");
			Cliente cliente = new Cliente();
			cliente.setCedula("1724934110");
			cliente.setNombre("Cinthia Malena");
			cliente.setApellido("Iza Cajia");
			System.out.println("Cedula:"+cliente.getCedula()+" Nombre:"+cliente.getNombre()+"  Apellido:"+cliente.getApellido());
			
			/**
			 * Agregando Creditos al Cliente
			 */
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++Agregado datos al Credito del cliente+++++++++++++++++++++++++++");
			Credito s= new Credito(1, "12/12/2019",10,15);
			cliente.setCreditos(s);
			System.out.println("El cliente tiene  este interes: " +cliente.getCreditos().getInteres());
			System.out.println("El cliente tiene plazo:"+ cliente.getCreditos().getPlazo());			
			System.out.println("El cliente tiene un total de creditos:"+ cliente.getCreditos().getTotalCreditos());
			System.out.println("/////////////////////////////////////////////////////Recargando el Credito del cliente///////////////////////////////");
			cliente.recargarCreditos(30);
			
			
			/**
			 * Compras de un Cliente
			 */
			System.out.println("------------------------------------------------------Creando la compra del Cliente---------------------------------");
			Compra compra= new Compra(1, "12/12/2020", cliente);
			compra.agregarlibImpreso(libImpreso);
			System.out.println("Total precio del libro impreso "+libImpreso.calcularPrecioFinal());
			compra.agregarlibImpreso(libImpreso1);
			compra.agregarlibDigital(libDigital);
			compra.agregarlibDigital(libDigital1);
			compra.agregarlibDigital(libDigital2);
			

			 System.out.println("El cliente: "+compra.getCliente().getNombre()
					 +"\n tiene una compra de libro digital"+compra.getListlibDigital()			 
					 +"\n tiene una compra de libro impreso: "+compra.getListlibImpreso()+",  gasto del envio de libro:  "+libImpreso.getGastoenvio()
					 +"\nFecha de compra: "+compra.getFecha()+" \nCodigo de compra: "+compra.getCodigo());
			 System.out.println("----------------------------------Calculo de libros Digital ---------------------------------------");
			/**
			 * Calculo de Valores de libro  Impreso y Digital	
			 */
			 System.out.println("Total precio de libro digital:"+ libDigital.calcularPrecioFinal()+"  Del libro : "+libDigital.toString());
			 System.out.println("Total precio de libro digital:"+ libDigital1.calcularPrecioFinal()+"  Del libro : "+libDigital1.toString());
			 System.out.println("Total precio de libro digital:"+ libDigital2.calcularPrecioFinal()+"  Del libro : "+libDigital2.toString());
			 System.out.println("----------------------------------Calculo de libros Impresos ---------------------------------------");
			 
			 System.out.println("\nTotal precio de libro Impreso :"+ libImpreso.calcularPrecioFinal()+"  Del libro : "+libImpreso.toString()+" Costo envio:"+libImpreso.getGastoenvio());
			 System.out.println("Total precio de libro Impreso :"+ libImpreso1.calcularPrecioFinal()+"  Del libro : "+libImpreso1.toString()+" Costo envio:"+libImpreso1.getGastoenvio());
				
	}

}

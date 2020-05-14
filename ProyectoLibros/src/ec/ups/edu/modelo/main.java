package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LibroImpreso libImpreso= new LibroImpreso();
			libImpreso.setAutos("William Golding");
			libImpreso.setTitulo("El señor de las moscas");
			libImpreso.setEdicion("2012");
			libImpreso.setPrecio(10.20);
			libImpreso.setComision(2);
			libImpreso.setGastoenvio(20);
		
			
						
			LibroImpreso libImpreso1= new LibroImpreso();
			libImpreso1.setAutos("Julio Verne");
			libImpreso1.setTitulo("Viaje al centro de la tierra");
			libImpreso1.setEdicion("1864");
			libImpreso1.setPrecio(20.20);
			libImpreso1.setComision(2);
			libImpreso1.setGastoenvio(20);

			bb n = new bb();
			System.out.println(n.listarLibroImpreso());
					
			//LibroDigital ll= new LibroDigital();
		

			libImpreso.listarLibroImpreso();
			System.out.println(libImpreso.toString());
			System.out.println(libImpreso.getTitulo());
			System.out.println(libImpreso1.toString());
			System.out.println(libImpreso1.getTitulo());

			
			List<LibroImpreso> ejemploLista = new ArrayList<LibroImpreso>();
			LibroImpreso li=new LibroImpreso();
			LibroImpreso li1=new LibroImpreso();
			
			System.out.println("Libro1");
			li.setTitulo("La madre de Frankenstein");
			li.setAutos("Almudena Grandes");
			li.setEdicion("Edicion1");
			li.setPrecio(10.20);
			li.setComision(10);
			li.setGastoenvio(4);
			
			System.out.println("Libro2");
			li1.setTitulo("Titanic");
			li1.setAutos("Jose Marti");
			li1.setEdicion("Edicion2");
			li1.setPrecio(10.20);
			li1.setComision(10);
			li1.setGastoenvio(4);

		    ejemploLista.add(li);
		    ejemploLista.add(li1);
		 
		    //Ver si esta en la lista
	        System.out.println(ejemploLista);
	        System.out.println("Ver si esta en la lista");
	        if(ejemploLista.contains("Almudena Grandes")) {
	        	for (int i = 0; i < ejemploLista.size(); i++) {
		            System.out.println("Titulo: " + ejemploLista.get(i).titulo   + " Autor: "
		                    + ejemploLista.get(i).autor 
		                    + " Edicion: " + ejemploLista.get(i).edicion + " Precio: " + ejemploLista.get(i).precio);
		            
		        }
	        }else {
	        	 System.out.println("No esta");
	        }
	        
	        for(LibroImpreso cadena: ejemploLista)
	            System.out.println (cadena.toString());
	      
	        LibroImpreso[] ListaPersonas = new LibroImpreso[100];
	        ListaPersonas[0] = li;
	        ListaPersonas[1] = li1;
	        System.out.println(ListaPersonas[0]);
	        System.out.println(ListaPersonas[1]);
	        
	        System.out.println("--------------------------------------------------");
	        for (int i = 0; i < ejemploLista.size(); i++) {
	            System.out.println("Titulo: " + ejemploLista.get(i).titulo   + " Autor: "
	                    + ejemploLista.get(i).autor 
	                    + " Edicion: " + ejemploLista.get(i).edicion + " Precio: " + ejemploLista.get(i).precio);
	            
	        }
	        
	        
	}

}

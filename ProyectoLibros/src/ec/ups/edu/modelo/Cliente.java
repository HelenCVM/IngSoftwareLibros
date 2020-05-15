package ec.ups.edu.modelo;

public class Cliente {
	public String cedula;
	public String nombre;
	public String apellido;
	public Credito creditos;
	
	public Cliente() {
		
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Cliente(String cedula, String nombre, String apellido) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public Credito getCreditos() {
		return creditos;
	}


	public void setCreditos(Credito creditos) {
		this.creditos = creditos;
	}


	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", creditos=" + creditos
				+ "]";
	}
	public int recargarCreditos(int abonar) {
		int total=(int) this.getCreditos().getTotalCreditos()+abonar;
		System.out.println("el cliente agrego: "+total);
		return total;
		
	}

}

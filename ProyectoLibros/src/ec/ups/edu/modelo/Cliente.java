package ec.ups.edu.modelo;

public class Cliente {
	public String cedula;
	public String nombre;
	public String apellido;
	public String correo;
	public String contra;
	public int numtargeta;
	
	public Cliente() {
		
	}
	
	public Cliente(String cedula, String nombre, String apellido, String correo, String contra, int numtargeta) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contra = contra;
		this.numtargeta = numtargeta;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	public int getNumtargeta() {
		return numtargeta;
	}
	public void setNumtargeta(int numtargeta) {
		this.numtargeta = numtargeta;
	}
	
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", contra=" + contra + ", numtargeta=" + numtargeta + "]";
	}
	
	
}

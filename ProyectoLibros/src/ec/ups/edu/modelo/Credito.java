package ec.ups.edu.modelo;

public class Credito {
	public int id;
	public String plazo;
	public double interes;
	public double totalCreditos;

	public Credito(int id, String plazo, double interes, double totalCreditos) {

		this.id = id;
		this.plazo = plazo;
		this.interes = interes;
		this.totalCreditos = totalCreditos;
	}

	public double getTotalCreditos() {
		return totalCreditos;
	}

	public void setTotalCreditos(double totalCreditos) {
		this.totalCreditos = totalCreditos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlazo() {
		return plazo;
	}

	public void setPlazo(String plazo) {
		this.plazo = plazo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	@Override
	public String toString() {
		return "Creditos [id=" + id + ", plazo=" + plazo + ", interes=" + interes + ", totalCreditos=" + totalCreditos
				+ "]";
	}

}

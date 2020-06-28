package oscurilandia_2;

public class Trupalla extends Carro {

	private int nivelArmadura;
	private String nombreConductor;

	public Trupalla(int canOcupa, String ingreso, int fila, int columna) {
		super(canOcupa, ingreso, fila, columna);
		// TODO Auto-generated constructor stub
	}

	public Trupalla(int canOcupa, String ingreso, int fila, int columna, int nivelArmadura, String nombreConductor) {
		super(canOcupa, ingreso, fila, columna);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
	}

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}
}

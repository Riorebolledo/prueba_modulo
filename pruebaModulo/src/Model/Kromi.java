package oscurilandia_2;

public class Kromi extends Carro {
	private int yearFabri;
	private String marca;
	
	public Kromi(int canOcupa, String ingreso, int fila, int columna) {
		super(canOcupa, ingreso, fila, columna);
	}
	
	public Kromi(int canOcupa, String ingreso, int fila, int columna, int yearFabri, String marca) {
		super(canOcupa, ingreso, fila, columna);
		this.yearFabri = yearFabri;
		this.marca = marca;
	}

	public int getYearFabri() {
		return yearFabri;
	}

	public void setYearFabri(int yearFabri) {
	this.yearFabri = yearFabri;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
			this.marca = marca;
	}

}

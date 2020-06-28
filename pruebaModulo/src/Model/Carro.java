package oscurilandia_2;

public class Carro {

	private int canOcupa;
	private String ingreso;
	private int fila;
	private int columna;

	public Carro(int canOcupa, String ingreso, int fila, int columna) {
		this.canOcupa = canOcupa;
		this.ingreso = ingreso;
		this.fila = fila;
		this.columna = columna;

	}

	public int getCanOcupa() {
		return canOcupa;
	}

	public void setCanOcupa(int canOcupa) {
		this.canOcupa = canOcupa;
	}

	public String getIngreso() {
		return ingreso;
	}

	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

}

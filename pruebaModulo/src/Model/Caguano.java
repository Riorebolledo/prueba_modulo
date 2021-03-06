package oscurilandia_2;

public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfeti;
	
	public Caguano(int canOcupa, String ingreso, int fila, int columna) {
		super(canOcupa, ingreso, fila, columna);
	}	
		
	public Caguano(int canOcupa, String ingreso, int fila, int columna, int alcanceTiro, String colorConfeti) {
		super(canOcupa, ingreso, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
			return colorConfeti;
	}

		public void setColorConfeti(String colorConfeti) {
			this.colorConfeti = colorConfeti;
	}
}

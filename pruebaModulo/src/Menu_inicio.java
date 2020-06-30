package oscurilandia_examen;

import java.util.Scanner;

public class Menu_inicio {

	static String enter;

	public static void main(String[] args) {

		System.out.println("----- CONSECUENCIAS -----");
		System.out.println("El gobierno de Oscurilandia esta corrompido y el pueblo se a levantado");
		System.out.println("y asi ha nacido la FirstLine, un grupo de super heroes que luchan contra");
		System.out.println("la camara secreta de Oscurilandia.");
		System.out.println("");
		System.out.println("Ayuda a FirtsLine en su lucha para derrocar a los corruptos");
		System.out.println("Debes lanzarles huevos a:");
		System.out.println("");
		System.out.println("Trupalla 	: 1 punto");
		System.out.println("Kromi	 	: 3 puntos y si la inutilizas +10 puntos");
		System.out.println("Caguano		: 2 puntos y si la inutilizas +7 puntos");
		System.out.println("");
		System.out.println("Contamos contigo en esta misión.");
		System.out.println("");
		System.out.println("Para iniciar partida presione ENTER");
		

		try (Scanner teclado = new Scanner(System.in)) {
			enter = teclado.nextLine();
		}
		
	}
}

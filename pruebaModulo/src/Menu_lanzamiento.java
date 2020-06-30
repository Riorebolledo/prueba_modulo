package oscurilandia_examen;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Menu_lanzamiento {
 
    public static void main(String[] args) {
 
        @SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        System.out.println("¿Desea lanzar un huevo?");
        while (!salir) {
 
            System.out.println("1. Lanzar huevo");
            System.out.println("2. No lanzar huevo");
  
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has lanzado un huevo");
                        break;
                    case 2:
                        System.out.println("no haz lanzado un huevo");
                        Scanner nt = new Scanner(System.in);
                        boolean exit = false;         
                        
                        int opciones;
                        while (!exit) {
                        
                            System.out.println("1. Reinciar partida");
                            System.out.println("2. Salir de la partida");
                            try {
                            	
                                System.out.println("Escribe una de las opciones");
                                opciones = nt.nextInt();                        
                            	
                                switch (opciones) {
                                    case 1:
                                    	exit = true;
                                        break;
                                        //reiniciar la partida
                                        
                                    case 2:
                                    	System.out.println("Haz salido de la partida");
                                		System.out.println("");
                                    	System.out.println("Gracias por jugar");
                                    	System.out.println("");
                                    	System.out.println("Bernardita");
                                    	System.out.println("Gonzalo");
                                    	System.out.println("Rodrigo");

                                    	boolean abandono = false;
                                    	while (!abandono) { 
                                    	abandono = false;
                                    	}
                                   
                                    default:
                                        System.out.println("Solo números entre 1 y 2");
                                } 
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                nt.next();
                                
                        }
                     }                      

                    default:
                        System.out.println("Solo números entre 1 y 2");
                        
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }
	
}


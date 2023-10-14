package resol_RosatiA;

import java.util.Scanner;

public class Ejercicio_15 {

	 public static void main(String[] args) {
	        char[] vocales = {'A', 'E', 'I', 'O', 'U'};
	        StringBuilder cadenaV = new StringBuilder();
	        Scanner ingresoDatos = new Scanner(System.in);

	        System.out.println("Escriba números de un solo digito para formar una cadena de vocales.");
	        System.out.println("Para finalizar, escriba -1.");

	        int posicion;
	        do {
	            System.out.print("Posición: ");
	            posicion = ingresoDatos.nextInt();

	            if (posicion >= 0 && posicion < vocales.length) {
	                cadenaV.append(vocales[posicion]);
	            } else if (posicion != -1) {
	                System.out.println("Error, inserte otro numero.");
	            }
	        } while (posicion != -1);

	        System.out.println("Resultado: " + cadenaV.toString());
	    }
}

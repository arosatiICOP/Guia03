package resol_RosatiA;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		
		saludar();

	}

	public static void saludar() {
		
		String nombre;
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese nombre completo.");
		
		nombre=ingresoDatos.nextLine();
		
		System.out.println("Nombre: "+nombre);
	}
}

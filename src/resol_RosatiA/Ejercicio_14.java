package resol_RosatiA;

import java.util.Scanner;

public class Ejercicio_14 {

	  public static void main(String[] args) {
	        int[] array = new int[10];
	        ingresarValores(array);
	        mostrarArray(array);
	    }

	    public static void ingresarValores(int[] array) {
	        Scanner ingresoDatos = new Scanner(System.in);

	        System.out.println("Ingresa 10 valores para el array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Valor en la posición " + i + ": ");
	            array[i] = ingresoDatos.nextInt();
	        }
	    }

	    public static void mostrarArray(int[] array) {
	        System.out.println("Índice	Valor");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(i + "\t" + array[i]);
	        }
	    }
}

package resol_RosatiA;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		
		arreglarProm();

	}
	
	public static void arreglarProm() {

		
		int numeros [] ={10,5,3,12,7,2,1,4};
		
		int resProm=0;
		
		for (int i = 0; i < numeros.length; i++) {
            resProm += numeros[i];
        }
		
		resProm=resProm/8;
		
		System.out.println("Promedio: "+resProm);
		
		System.out.println("Números mayores que el promedio:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > resProm) {
                System.out.println(numeros[i]);
            }
        }
	}
}

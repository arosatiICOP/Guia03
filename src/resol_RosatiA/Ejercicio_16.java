package resol_RosatiA;

import java.util.Scanner;

public class Ejercicio_16 {

	 public static void main(String[] args) {
	        
		 int longitud = 8;
	        
		 double[] notas = new double[longitud];
	     String[] nombres = new String[longitud];

	        ingresarNotasYalumnos(notas, nombres);
	        String[] resultados = calcularRes(notas);

	        mostrarDatosA(nombres, notas, resultados);
	    }
	 
	   public static void mostrarDatosA(String[] nombres, double[] notas, String[] resultados) {
	        System.out.println("Alumnos y sus notas:");
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.println(nombres[i] + " - Nota: " + notas[i] + " - Resultado: " + resultados[i]);
	        }
	    }

	    public static void ingresarNotasYalumnos(double[] notas, String[] nombres) {
	        Scanner ingresoDatos = new Scanner(System.in);

	        for (int i = 0; i < notas.length; i++) {
	            System.out.print("Nombre del alumno: " + (i + 1) + ": ");
	            nombres[i] = ingresoDatos.next();
	            
	            do {
	                System.out.print("Nota del alumno: " + (i + 1) + ": ");
	                notas[i] = ingresoDatos.nextDouble();
	                
	            if (notas[i]< 0 || notas[i] >10) {
	                    System.out.println("Nota no válida. Debe estar entre 0 y 10.");
	                }
	                
	            } while (notas[i]<0 || notas[i] >10);
	        }
	    }

	    public static String[] calcularRes(double[] notas) {
	        String[] resultados = new String[notas.length];
    
	        for (int i = 0; i < notas.length; i++) {
				    		            
	        	if (notas[i] >= 0 && notas[i] <= 4.99) {
				                resultados[i] = "Suspenso.";	            
	        	} else if (notas[i] >= 5 && notas[i] <= 6.99) {
				                resultados[i] = "Bien.";
    
	        	} else if (notas[i] >= 7 && notas[i] <= 8.99) {
				                resultados[i] = "Notable.";
          
	        	} else if (notas[i] >= 9 && notas[i] <= 10) {
				                resultados[i] = "Sobresaliente.";           
	        	}
				        
	        }	       
	        return resultados;		    
	    }
}

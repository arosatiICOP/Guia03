package resol_RosatiA;

public class Ejercicio_09 {

	 public static void main(String[] args) {
	        int[] arreglo = {85, 25, 12, 22, 56, 34};

	        System.out.println("Arreglo original:");
	        imprimirA(arreglo);

	        ordenSeleccion(arreglo);

	        System.out.println("\nArreglo ordenado:");
	        imprimirA(arreglo);
	    }

	    public static void ordenSeleccion(int[] arreglo){
	        int n = arreglo.length;

	        for (int i = 0; i < n - 1; i++) {
	            int indiceMinimo = i;

	            for (int j = i + 1; j < n; j++) {
	                if (arreglo[j] < arreglo[indiceMinimo]){
	                    indiceMinimo = j;
	                }
	            }

	            int temp = arreglo[indiceMinimo];
	            arreglo[indiceMinimo] = arreglo[i];
	            arreglo[i] = temp;
	        }
	    }

	    public static void imprimirA(int[] arreglo){
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.print(arreglo[i] + " ");
	        }
	        System.out.println();
	    }
}

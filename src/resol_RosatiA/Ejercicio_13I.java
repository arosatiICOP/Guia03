package resol_RosatiA;

public class Ejercicio_13I {

	 public static int sumaNumN(int n) {
	        int suma = 0;
	        for (int i = 1; i <= n; i++) {
	            suma += i;
	        }
	        return suma;
	    }
	 
	 // Me resultó mas facil hacerlo de forma iterativa, ya que se me hace mas facil y practico el uso del for que del if

	    public static void main(String[] args) {
	        int N = 8;
	        int resultado = sumaNumN(N);
	        System.out.println("La suma de los primeros " + N + " números naturales de forma iterativa es: " + resultado);
	    }
}

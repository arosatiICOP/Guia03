package resol_RosatiA;

public class Ejercicio_13R {
	
	// Forma recursiva

	public static int sumaNumN(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaNumN(n - 1);
        }
    }
	
    public static void main(String[] args) {
        int N= 16; 
        int resultado= sumaNumN(N);
        System.out.println("La suma de los primeros " + N + " números naturales de forma recursiva es: " + resultado);
    }
}

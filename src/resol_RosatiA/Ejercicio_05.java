package resol_RosatiA;

public class Ejercicio_05 {
	
	public static void main(String[] args) {
        int n = 6;
        int resultado = calcularF(n);
        System.out.println("El enesimo elemento de la serie de Fibonacci para n=" + n + " es: " + resultado);
    }

    public static int calcularF(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return calcularF(n - 1) + calcularF(n - 2);
        }
    }
}

package resol_RosatiA;

public class Ejercicio_06 {

	 public static void main(String[] args) {
		 
	        int num = 25;
	        boolean calculoNumP = esNumPrimo(num);

	    if (calculoNumP) {
	            System.out.println("El numero ingresado: "+num + " es un numero primo.");
	   		} else {
	            System.out.println("El numero ingresado: "+num + " no es un numero primo.");
	        }
	    }

	    public static boolean esNumPrimo(int num) {
	        
	    if (num <= 1) {
	            return false;
	        }

	    if (num <= 3) {
	            return true;
	        }

	    if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }

	    for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	    return true;
	    }
}

package resol_RosatiA;

public class Ejercicio_04 {

	 public static void main(String[] args) {
	        
		 String contrasena = "C0ntras3n4_Pru3b4";

	     boolean esSegura = esContSegura(contrasena);

	        if (esSegura) {
	            System.out.println("La contraseña es segura.");
	        } else {
	            System.out.println("La contraseña no es segura.");
	        }
	 }

	 public static boolean esContSegura(String contrasena) {
	        
		 int mayusculas = 0;
		 int minusculas = 0;
		 int digitos = 0;

	        if (contrasena.length() < 8) {
	            return false;
	        }
	        
	        for (int i = 0; i < contrasena.length(); i++) {
	            char caracter = contrasena.charAt(i);

	            if (Character.isUpperCase(caracter)) {
	                mayusculas++;
	            } else if (Character.isLowerCase(caracter)) {
	                minusculas++;
	            } else if (Character.isDigit(caracter)) {
	                digitos++;
	            } else if (caracter != '_') {
	                return false;
	            }
	        }

	        if (mayusculas >= 2 && minusculas >= 3 && digitos >= 2) {
	            return true;
	        } else {
	            return false;
	        }
	 }
}

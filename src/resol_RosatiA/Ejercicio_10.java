package resol_RosatiA;

public class Ejercicio_10 {
	
	public static void main(String[] args) {

        String isbn1 = "0-7645-2641-3";
        String isbn2 = "2-8254-4280-6";
        String isbn3 = "2-1234-5680-2";


        System.out.println("ISBN 0-7645-2641-3: " + verificarISBN(isbn1));
        System.out.println("ISBN 2-8254-4280-6: " + verificarISBN(isbn2));
        System.out.println("ISBN 2-1234-5680-2: " + verificarISBN(isbn3));
    }
	
	public static char checkIsbn(String isbnBase) {
	        
		isbnBase = isbnBase.replace("-","");
		int suma = 0;
		int digitoControl = suma % 11;
		
		if (isbnBase.length() != 9) {
	            System.out.println("El ISBN debe contener 9 dígitos.");
	            return ' ';
	      }

		for (int i=0; i < 9; i++) {
	            suma += (i + 1) * Character.getNumericValue(isbnBase.charAt(i));
	      }

		if (digitoControl == 10) {
	            return 'X';
	        } else {
	            return (char) (digitoControl + '0');
	      }  
	}

	public static String verificarISBN(String isbn) {
	        
		String isbnBase = isbn.substring(0, isbn.length() - 2); 
		char isbnDigV = checkIsbn(isbnBase);
    
		if (isbnDigV == ' ') {
	            return "ISBN incorrecto. La longitud es incorrecta.";
		}

	        char isbnC = isbn.charAt(isbn.length() - 1);
	        
	     if (isbnDigV == isbnC) {
	            return "ISBN ok.";
	        } else {
	            return "ISBN incorrecto.";
	        }
	    }
}

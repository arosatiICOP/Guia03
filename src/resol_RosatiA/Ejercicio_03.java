package resol_RosatiA;

public class Ejercicio_03 {
    public static void main(String[] args) {
        
        esCapicua();   
    }
        public static void esCapicua() {
        
        int numero= 4554;
        boolean esCapicua= true;
        	
        String numeroStr = Integer.toString(numero);

        int longitud= numeroStr.length();


        for (int i = 0; i < longitud / 2; i++){
            if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                esCapicua = false;
                break;
            }
        }

        if (esCapicua){
            System.out.println("El numero ingresado: "+numero + " es capicua.");
        } else {
            System.out.println("El numero ingresado: "+numero + " no es capicua.");
        }
    }
}

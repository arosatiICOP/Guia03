package resol_RosatiA;

public class Ejercicio_07 {
	public static void main(String[] args) {
        String texto = "Practica de Programacion ABCdef";
        int totalPalabras = contarPalabras(texto);

        System.out.println("El texto ingresado tiene " + totalPalabras+" palabras.");
    }

    public static int contarPalabras(String texto) {
        String[] palabras = texto.split("\\s+|[,.;]");

        int contador = 0;
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                contador++;
            }
        }

        return contador;
    }
}

package resol_RosatiA;

public class Ejercicio_12B {

	public static void main(String[] args) {
        int C= 86;

        String resultado = (C >= 0) ? C + " es positivo" : C + " es negativo";
        resultado += (C % 2 == 0) ? "\n" + C + " es par" : "\n" + C + " es impar";
        resultado += (C % 5 == 0) ? "\n" + C + " es múltiplo de 5" : "\n" + C + " no es múltiplo de 5";
        resultado += (C % 10 == 0) ? "\n" + C + " es múltiplo de 10" : "\n" + C + " no es múltiplo de 10";
        resultado += (C < 100) ? "\n" + C + " es menor que 100" : "\n" + C + " es mayor o igual que 100";

        System.out.println(resultado);
    }
}

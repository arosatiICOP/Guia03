package resol_RosatiA;

public class Ejercicio_08 {
	
    public static void main(String[] args) {
    	
        int monto = 485;

        contarBilletes(monto);
    }

    public static void contarBilletes(int monto) {
        int[] denominacionB = {100, 50, 20, 10, 5, 2, 1};
        String[] valorB = {"$100", "$50", "$20", "$10", "$5", "$2", "$1"};
        
        System.out.println("Monto: $" + monto);
        System.out.println("Cantidad de billetes:");

        for (int i = 0; i < denominacionB.length; i++) {
            int cantBilletes=monto/denominacionB[i];
            monto%= denominacionB[i];

            if (cantBilletes > 0) {
                System.out.println(valorB[i]+": "+cantBilletes);
            }
        }
    }
}

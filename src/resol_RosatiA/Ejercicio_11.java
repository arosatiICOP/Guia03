package resol_RosatiA;

public class Ejercicio_11 {

	 public static void main(String[] args) {
	       
		 int N=5;		double A= 4.56;	char C= 'a';
    
	 System.out.println("Valor de las variables:");
	 System.out.println("Variable N= " +N);       	
	 System.out.println("Variable A= " +A);      
	 System.out.println("Variable C= " +C);
       
	 double sumaNyA= N + A;
	 
	 double diferenciaAyN= A - N;
	 
	 int valorC= (int)C;
	 
	 double sumaTotal= sumaNyA + valorC;
	              
	 System.out.println("Resultados:\n");
	 System.out.println(N + " + " +A+ " = " +sumaNyA);     
	 System.out.println(A + " - " +N+ " = " +diferenciaAyN);     
	 System.out.println("Valor de " +C+ " = " +valorC);    
	 System.out.println("Suma = " +sumaTotal);
	    
	 }
}


package ip_lista_;

import java.util.Scanner;

public class L1_ex16 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
   	double C, C1, C2, C3;
   
    	System.out.println("Esse algoritmo determina o salario restante de Joao depois de pagar algumas dividas.");
   	System.out.println("Escreva o salario");
   	C = Double.parseDouble(input.nextLine()); 	 
    	C1 = 200*1.02;
    	C2 = 120*1.02;
    	C3 = C - C1 - C2;
    	System.out.println("Restou "+C3+" do salario de Joao.");
    } 
}

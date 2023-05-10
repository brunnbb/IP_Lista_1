
package ip_lista_;

import java.util.Scanner;

public class L1_ex15 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
   	double k, k1, k2;
 
    	System.out.println("Esse algoritmo determina o peso de uma pessoa se ela engordar 15% ou emagrecer 20%.");
   	System.out.println("Escreva o peso");
   	k = Double.parseDouble(input.nextLine());
    	k1 = k+k*0.15;
    	k2 = k*0.8;
    	System.out.println("O peso se a pessoa engordar e: "+k1+" kg");
    	System.out.println("O peso se a pessoa emagrecer e: "+k2+" kg"); 
	} 
}

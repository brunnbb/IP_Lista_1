
package ip_lista_;

import java.util.Scanner;

public class L1_ex12 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
   	double x, y;
  	 
   	System.out.println("Esse algoritmo imprime o valor a pagar por uma refeição cobrada por kg.");
   	System.out.println("Escreva o peso do prato em quilos.");
   	x = Double.parseDouble(input.nextLine());
    	y = (x-0.45)*39;
    	System.out.println("O valor a ser cobrado e: "+y);
   	}
}

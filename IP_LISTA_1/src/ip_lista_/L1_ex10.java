
package ip_lista_;

import java.util.Scanner;

public class L1_ex10 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int x;
   	 
    	System.out.println("Esse algoritmo apresenta o quociente e o resto de um numero inteiro dividido por 2");
    	System.out.println("Escreva um numero inteiro.");
    	x = Integer.parseInt(input.nextLine());
    	System.out.println("O valor do quociente: "+x/2);
    	System.out.println("O valor do resto e: "+x%2);
	} 
}

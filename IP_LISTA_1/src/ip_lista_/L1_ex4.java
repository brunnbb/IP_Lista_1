
package ip_lista_;

import java.util.Scanner;

public class L1_ex4 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x;
    	int y;
    	System.out.println("Esse algoritmo calcula o quadrado da soma de dois numeros.");
    	System.out.println("Escreva dois numeros inteiros");
    	x = Integer.parseInt(input.nextLine());
    	y = Integer.parseInt(input.nextLine());
    	System.out.println("A soma dos Quadrados dos seus numeros e: "+((x+y)*(x+y)));}
}

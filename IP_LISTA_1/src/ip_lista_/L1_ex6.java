
package ip_lista_;

import java.util.Scanner;

public class L1_ex6 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	float x;
    	System.out.println("Esse algoritmo transforma transforma a temperatura de Celsius para Fahrenheit.");
    	System.out.println("Escreva o valor desejado em Celsius.");
    	x = Float.parseFloat(input.nextLine());
    	System.out.println("A temperatura em Fahrenheit e: "+(x*9/5+32));}  
}

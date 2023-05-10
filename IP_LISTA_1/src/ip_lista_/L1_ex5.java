
package ip_lista_;

import java.util.Scanner;

public class L1_ex5 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double x;
    	double y;
    	System.out.println("Esse algoritmo calcula a area e o perimetro de um retangulo.");
    	System.out.println("Escreva o valor da base e da altuna");
    	x = Double.parseDouble(input.nextLine());
    	y = Double.parseDouble(input.nextLine());
    	System.out.println("A area desse retangulo e: "+(x*y));
    	System.out.println("O perimetro desse retangulo e: "+(2*x+2*y));}
}

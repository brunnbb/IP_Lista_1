
package ip_lista_;

import java.util.Scanner;


public class L1_ex13 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
   	int h, m, s, t;
 
    	System.out.println("Esse algoritmo determina quantos segundos se passaram desde o comeco do dia. Baseado no horario local.");
   	System.out.println("Escreva as horas");
   	h = Integer.parseInt(input.nextLine());
    	System.out.println("Escreva os minutos");
    	m = Integer.parseInt(input.nextLine());
    	System.out.println("Escreva os segundos");
    	s = Integer.parseInt(input.nextLine());
    	t = h*3600 + m*60 + s;
    	System.out.println("Se passaram: "+t+"s"); 
	}
}
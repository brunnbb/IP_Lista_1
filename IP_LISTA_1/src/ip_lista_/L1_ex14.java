
package ip_lista_;

import java.util.Scanner;

public class L1_ex14 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
   	int h, m, s, t, t1;
 
    	System.out.println("Esse algoritmo determina quantos segundos faltam para completar o dia. Baseado no horario local.");
   	System.out.println("Escreva as horas");
   	h = Integer.parseInt(input.nextLine());
    	System.out.println("Escreva os minutos");
    	m = Integer.parseInt(input.nextLine());
    	System.out.println("Escreva os segundos");
    	s = Integer.parseInt(input.nextLine());
    	t = h*3600 + m*60 + s;
    	t1 = 86400-t;
    	System.out.println("Faltam "+t1+"s");  }  
}


package ip_lista_;

import java.util.Scanner;

public class L1_ex11 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int t, h, r, min, s;
   	 
    	System.out.println("Esse algoritmo transforma segundos de um video no modelo horas/minutos/segundos.");
    	System.out.println("Escreva a duracao do video em segundos");
    	t = Integer.parseInt(input.nextLine());
    	h = t/3600;
    	r = t%3600;
    	min = r/60;
    	s = r%60;
    	System.out.println("Duracao no modelo horas/minutos/segundos: "+(h)+"h"+(min)+"min"+(s)+"s");
    	}  
}

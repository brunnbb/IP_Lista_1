
package ip_lista_;

import java.util.Scanner;

public class L1_ex7 {
     public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double Q1, Q2, Q3, V1, V2, V3;
   	 
    	System.out.println("Esse algoritmo apresenta o valor arrecadado pelo venda de tres tipos de picole.");
    	System.out.println("Escreva quantidade vendida de cada um dos tipos de picole.");
    	Q1 = Double.parseDouble(input.nextLine());
    	Q2 = Double.parseDouble(input.nextLine());
    	Q3 = Double.parseDouble(input.nextLine());
    	V1 = Q1*1.5;
    	V2 = Q2*2;
    	V3 = Q3*0.75;
    	System.out.println("Valor arrecadado pelo primeiro tipo de picole: "+V1);
    	System.out.println("Valor arrecadado pelo segundo tipo de picole: "+V2);
    	System.out.println("Valor arrecadado pelo terceiro tipo de picole: "+V3);
    	System.out.println("Valor arrecadado total: "+(V1+V2+V3));
    	} 
}

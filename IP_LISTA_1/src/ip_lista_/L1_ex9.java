
package ip_lista_;

import java.util.Scanner;

public class L1_ex9 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double C, L, B, CC, CL, CB, GC, GL, GB, GT;
   	 
    	System.out.println("Esse algoritmo imprime o gasto dado pela compra de cafe, leite e bolachas.");
    	System.out.println("Escreva o quantidade comprada, em quilos, de cafe. Depois escreva o preco do kg.");
    	C = Double.parseDouble(input.nextLine());
    	CC = Double.parseDouble(input.nextLine());
    	System.out.println("Escreva o quantidade comprada, em litro, de leite. Depois escreva o preco do litro.");
    	L = Double.parseDouble(input.nextLine());
    	CL = Double.parseDouble(input.nextLine());
    	System.out.println("Escreva o quantidade comprada, em pacotes, de bolacha. Depois escreva o preco do pacote.");
    	B = Double.parseDouble(input.nextLine());
    	CB = Double.parseDouble(input.nextLine());
    	GC = C*CC;
    	GL = L*CL;
    	GB = B*CB;
    	GT = GB + GL + GC;
    	System.out.println("O custo com cafe e: "+GC);
    	System.out.println("O custo com leite e: "+GL);
    	System.out.println("O custo com bolacha e: "+GB);
    	System.out.println("O custo total e: "+GT);
    	} 
}

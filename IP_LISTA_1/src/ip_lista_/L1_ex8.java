
package ip_lista_;

import java.util.Scanner;

public class L1_ex8 {
       public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double Min, Ven, Val, Sal;
   	 
    	System.out.println("Esse algoritmo entrega o salario final de um funcionario");
    	System.out.println("Escreva o salario minimo.");
    	Min = Double.parseDouble(input.nextLine());
    	System.out.println("Escreva a quantidade de carros vendida.");
    	Ven = Double.parseDouble(input.nextLine());
    	System.out.println("Escreva o valor das vendas.");
    	Val = Double.parseDouble(input.nextLine());
    	Sal = 2*Min + 150*Ven + Val*0.05;
    	System.out.println("O valor do salario final e: "+Sal);
	}  
}


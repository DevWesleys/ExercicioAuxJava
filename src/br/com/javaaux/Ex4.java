package br.com.javaaux;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		  double a,b,c,r,s,d;
		  
	       System.out.println("Digite o primeiro numero: ");
	        a = ler.nextInt();
	        
	        System.out.println("Digite o segundo numero: ");
	        b = ler.nextInt();
	        
	      System.out.println("Digite o terceiro numero: ");
	        c = ler.nextInt();
	     
	    r = Math.pow(( a +  b),2);
	    
	    s = Math.pow((b+c),2);
	    		
	    d =(r+s)/2;
	    
	// Saida do resultado
	 System.out.println(" o resultado da expressão é " + d);


	}

}

package br.com.javaaux;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,d,E,f,x,y;

		System.out.println("o primeiro n �: ");
		a = ler.nextInt();
		
		System.out.println("o segundo n �: ");
		b = ler.nextInt();
		
		System.out.println("o terceito n �: ");
		c = ler.nextInt();
		
		System.out.println("o quarto n �: ");
		d = ler.nextInt();
				
		System.out.println("o quinto n �: ");
		E = ler.nextInt();
		
		System.out.println("o sexto n �: ");
		f = ler.nextInt();

		x =((c*E)-(b*f))/((a*E)-(b*d));
		y =((a*f)-(c*d))/((a*E)-(b*d));

		System.out.println("O valor de x �: " + x + " e o valor de y �: " + y);
		
	}
}



